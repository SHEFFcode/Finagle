import java.lang

import com.shefmachine.temperature.thrift._
import com.twitter.finagle.Mux
import com.twitter.finagle.ssl.Protocols
import org.apache.thrift.async.AsyncMethodCallback

// this is the raw implementation with the twitter Async based API
val service = new TemperatureService.AsyncIface {
  override def add(damum: TemperatureDatum, resultHandler: AsyncMethodCallback[Void]): Unit = ???

  override def mean(resultHandler: AsyncMethodCallback[lang.Double]): Unit = ???
}

// scrooge generates class to wrap a thrift service into a finagle compatible service definition
val finagledService = TemperatureService.AsyncProcessor

val server = Mux.server
  .withLabel("temperature-service")
//  .serveAndAnnounce("zk!127.0.0.1:2181!/service/temperature!0", finagledService)