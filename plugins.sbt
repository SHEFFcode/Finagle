//resolvers += "twitter-repo" at "https://maven.twttr.com"
//resolvers += "scrooge-sbt-plugin" at "https://bintray.com"
//resolvers += "bintray" at "https://dl.bintray.com/twittercsl/sbt-plugins"

resolvers += Resolver.url(
  "bintray-twittercsl-sbt-plugins",
  url("http://dl.bintray.com/twittercsl/sbt-plugins"))(
  Resolver.ivyStylePatterns)

addSbtPlugin("com.twitter" % "scrooge-sbt-plugin" % "18.12.0")