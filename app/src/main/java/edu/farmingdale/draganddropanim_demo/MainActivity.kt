package edu.farmingdale.draganddropanim_demo

import android.content.pm.ActivityInfo
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import edu.farmingdale.draganddropanim_demo.ui.theme.DragAndDropAnim_DemoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE
        enableEdgeToEdge()
        setContent {
            DragAndDropAnim_DemoTheme {
                Scaffold (modifier = Modifier.fillMaxSize()){innerPadding ->
                    DragAndDropBoxes(Modifier.padding(top = innerPadding.calculateTopPadding()))
                }


            }
        }
    }
}



// This should be completed in a group setting
// ToDone 1: Analyze the requirements for Individual Project 3
// ToDone 2: Show the DragAndDropBoxes composable
// ToDone 3: Change the circle to a rect
// ToDone 4: Replace the command right with a image or icon
// ToDone 5: Make this works in landscape mode only
// ToDone 6: Rotate the rect around itself
// ToDone 7: Move - translate the rect horizontally and vertically
// ToDone 8: Add a button to reset the rect to the center of the screen
// ToDone 9: Enable certain animation based on the drop event (like up or down)
// ToDo 10: Make sure to commit for each one of the above and submit this individually

