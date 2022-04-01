'use strict';
// Não precisa instalar pois ela já está instalada no ambiente da sdk
const AWS = require('aws-sdk');
const sharp = require('sharp');
const { basename, extname } = require('path')

const S3 = new AWS.S3();

const bucket = process.env.bucket

// Pode vim mais de uma imagem, quando por acaso várias solicitações são feitas ao mesmo tempo...
// Por isso tratar como somente uma imagem pode resultar em erro ou talvez em falta de processamento de algumas imagens
module.exports.handle = async ({ Records: records }, context) => {
  try {
    // Promise all para tratar todas as solicitações e também para optmizar o código kk
    await Promise.all(records.map( async record => {
      // pegar a chave da imagem na S3
      const { key } = record.s3.object;

      const image = await S3.getObject({
        Bucket: bucket,
        Key: key,
      }).promise()

      const optimized = await sharp(image.Body)
        .resize(1280, 720, { fit: 'inside', withoutEnlargement: true })
        .toFormat('jpeg', { progressive:  true, quality: 50})
        .toBuffer()

        await S3.putObject({
          Body: optimized,
          Bucket: bucket,
          ContentType: 'image/jpeg',
          Key: `compressed/${basename(key, extname(key))}.jpg`
        }).promise()
    }))

    return {
      statusCode: 301,
      body: { ok: true }
    };
  } catch(e) {
    return err;
  }
};
