
# define o interpretador que será utilizado
#!/bin/bash

# define qual arquivo será usado para ler a lista de URLs
URL_LIST="urls.txt"

# carrega o conteúdo do arquivo num array
readarray URLS < ${URL_LIST}

# para cada URL, executa o curl, extrai o status da requisição, verifica se foi bem sucedido
# e informa o resultado
for URL in ${URLS[@]}
do
    RESPONSE="$(curl -s -I ${URL})"

    STATUS=$(echo $RESPONSE | grep "HTTP" | cut -d " " -f 2)

    if [[ ${STATUS} -eq "200" ]]
    then
        echo $URL [SUCESSO]
    fi
done