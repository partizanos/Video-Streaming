Video-Streaming
===============
The project is an attempt to transmit a video using web socket protocoll instead of the http which is used widely.
It is composed by:

-Client using javascript to implement whe websocket reciever and the video player using the native html5 <video> tag.

-Websocket Server endpoint, implemented in java, which will send the file to the client using the web javax.websocket library.
