package study.kafka

import java.time.Duration
import java.util.Properties

import org.apache.kafka.clients.producer._
import org.apache.kafka.common.serialization.StringSerializer

object MessageProducerApp extends App with ConnectivityDetails {

  val props = new Properties()
  props.put("client.id", "KafkaProducerExample")
  props.put("linger.ms", "0")
  props.put("request.timeout.ms", "10000")
  props.put("bootstrap.servers", bootstrapServers)
  props.put("key.serializer", classOf[StringSerializer].getCanonicalName)
  props.put("value.serializer", classOf[StringSerializer].getCanonicalName)
  val producer = new KafkaProducer[String, String](props)
  val data = new ProducerRecord[String, String](testTopicName, "message", "key")
  //data.headers().add(new RecordHeader("state", "EUR/USD".getBytes))

  println("sending ...")
  producer.send(data, new Callback {
    override def onCompletion(metadata: RecordMetadata, exception: Exception): Unit = {
      println("completion")
      Option(exception).foreach(_.printStackTrace())
      Option(metadata).foreach(println)
    }
  })
  println("sent")

  producer.close(Duration.ofSeconds(1))
  println("done")
}
