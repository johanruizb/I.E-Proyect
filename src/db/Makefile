create:
	gnome-terminal && docker run -d \
	--name post_evidence \
	-e POSTGRES_USER=root \
	-e POSTGRES_PASSWORD=root \
	-e POSTGRES_DB=post_evidence \
	-e PGDATA=/var/lib/postgresql/data/pgdata \
	-v pos_evidence_Volume:/var/lib/postgresql/data \
	-p 5432:5432 \
	postgres && docker container attach post_evidence

recreate:
	make stop && make delete && make create

restart: 
	make stop && make connect

connect: 
	gnome-terminal && docker container start post_evidence && docker container attach post_evidence

attach:
	docker container exec -it post_evidence psql -U root

stop: 
	docker container stop post_evidence
	exit

delete:
	docker container stop post_evidence && docker container rm post_evidence

