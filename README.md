# Journal_service
Journal_service integration for user-events

#kafka commands:

#command to launch zookeeper
./zookeeper-server-start.sh ~/kafka_2.13-3.1.0/config/zookeeper.properties

#command to launch kafka
./kafka-server-start.sh ~/kafka_2.13-3.1.0/config/server.properties 

#command to create kafka topic
./kafka-topics.sh --create-topic --bootstrap-server localhost:9093 --topic user-events
./kafka-topics.sh  --bootstrap-server localhost:9093 --create-topic user-events
./kafka-topics.sh  --bootstrap-server localhost:9093 --create --topic user-events
./kafka-topics.sh  --bootstrap-server localhost:9093 --list

#command to create consumer group
./kafka-console-consumer.sh --bootstrap-server localhost:9093 --topic user-events --group user-track-events
