Video-Streaming
===============
The project is an attempt to transmit a video mp4 file using web socket protocoll instead of the http which is used widely.
It is composed by:

-Client using javascript to implement whe websocket reciever and the video player using the native html5 <video> tag.
(Client File: Video-Streaming / src / main / webapp / index.html)

-Websocket Server endpoint, implemented in java, which will send the file to the client using the web javax.websocket library.
( Server File: Video-Streaming / src / main / java / org.glassfish.samples.websocket.echo / EchoEndpoint.java )

I wrote the project using Netbeans IDE and I run the server and client locally using the Glashfish web server.
