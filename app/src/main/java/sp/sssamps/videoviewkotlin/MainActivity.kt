package sp.sssamps.videoviewkotlin

import android.net.Uri
import android.os.Bundle
import android.widget.MediaController
import android.widget.VideoView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var videoView: VideoView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        videoView = findViewById(R.id.videoView)

        // Define the path of the video file
        val videoPath = "android.resource://" + packageName + "/" + R.raw.wallpaper

        // Create a Uri object from the video path
        val videoUri = Uri.parse(videoPath)

        // Set the media controller for controlling playback
        videoView.setMediaController(MediaController(this))

        // Set the video URI to the VideoView
        videoView.setVideoURI(videoUri)

        // Start playing the video
        videoView.start()
    }
}