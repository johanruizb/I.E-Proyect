create:
	gnome-terminal && docker run -d \
	--name post_evidence \
	-e POSTGRES_PASSWORD=root \
	-e POSTGRES_DB=post_evidence \
	-v pos_evidence_Volume:/var/lib/postgresql/data \
	-p 5432:5432 \
	postgres && docker container attach post_evidence

recreate:
	make delete && make create

restart: 
	docker container restart post_evidence && docker container attach post_evidence

connect: 
	gnome-terminal && docker container start post_evidence && docker container attach post_evidence

attach:
	docker container exec -it post_evidence psql -U postgres
	
command:
	docker container exec -it post_evidence sh

stop: 
	docker container stop post_evidence

delete:
	make stop && docker container rm post_evidence && docker volume rm pos_evidence_Volume

