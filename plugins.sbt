/**
  * See this for Scrooge installation solution: https://stackoverflow.com/questions/29404557/cant-resolve-to-plugin-published-in-bintray
  */



resolvers += Resolver.url(
  "bintray-twittercsl-sbt-plugins",
  url("http://dl.bintray.com/twittercsl/sbt-plugins"))(
  Resolver.ivyStylePatterns)

addSbtPlugin("com.twitter" % "scrooge-sbt-plugin" % "18.12.0")