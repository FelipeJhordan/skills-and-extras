# Simples solicitação
curl www.google.com
#  fazer solicitação do tipo GET para a página do GOOGLE com redirecionamento
curl -L www.google.com.br

# forma verbosa - com os headers da requisição http
curl -i https://www.google.com.br

# forma verbosa - SOMENTE com os headers da requisição http
curl -I https://www.google.com.br

# Para baixar um arquivo
curl -O https://releases.ubuntu.com/20.04.1/ubuntu-20.04.1-desktop-amd64.iso

# Para baixar um arquivo e já salvar com um nome pre-determinado
curl -O https://releases.ubuntu.com/20.04.1/ubuntu-20.04.1-desktop-amd64.iso isoUbuntu.iso

# Caso Algum download tenha sido "pausado/interrompido"  é possivel continua-lo
curl -C - -O https://releases.ubuntu.com/20.04.1/ubuntu-20.04.1-desktop-amd64.iso


# ----------------------------------------------
# Request para api JSONPlaceholder
curl https://jsonplaceholder.typicode.com/posts

# Request especificando o metodo
curl -X GET https://jsonplaceholder.typicode.com/posts

# Criação de um POST
curl -i -X POST https://jsonplaceholder.typicode.com/comments \
    -H 'Content-Type: application/json' \
    -d $'{
            "postId": 101, 
            "name": "Vitor Almeida", 
            "email": "vitor.almeida@alura.com.br",
            "body": "De acordo ao manual do curl ( disponível online [...]"
          }
        '