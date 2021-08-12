docker rmi player -f
docker build . -t player
docker run -d -p 9010:9002 player