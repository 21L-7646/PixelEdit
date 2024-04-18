package com.example.composetutorial

import android.graphics.Bitmap
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composetutorial.ui.theme.ComposeTutorialTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        /*setContent {
            //Column's main axis is vertical, cross-axis is horizontal.
            //For the main axis, we use the 'Arrangement' property.
            //For the cross axis, we use the 'Alignment' property.
            //Row's and columns have only as much height and width as they require for their views.
            Column (
                modifier = Modifier
                    .fillMaxHeight(0.75f)
                    .width(400.dp)  //dp stands for device pixel
                    .background(Color.Green),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.SpaceAround
            )   {
                Text("Hi, Ali!")
                Text("Hello, others!")
            }
        }*/

        /*setContent {
            //padding() adds space around the component, while offset() moves the component’s position relative to its parent.
            Column (modifier = Modifier
                .background(Color.Green)
                //.requiredWidth(400.dp)    //To force the width to be 400 dp wide
                .fillMaxSize()
                .padding(vertical = 20.dp)
            )   {
                //Can also apply modifiers to composables
                Text("Hi, Ali!", modifier = Modifier
                    .offset(100.dp, 20.dp)) //offset does not push away other elements i.e., this composable may now overlap with some other composable.
                Text("Hello, everyone!")
            }
        }*/

        setContent {
            Column (
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.DarkGray),
                    verticalArrangement = Arrangement.SpaceBetween
            ) {
                Row (modifier = Modifier
                    .fillMaxHeight(0.1f)
                    .fillMaxWidth()
                    .background(Color.Black)
                    .padding(horizontal = 20.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Button(onClick = { }) {
                        Text("Back")
                    }

                    Button(onClick = { }) {
                        Text("Save")
                    }
                }
                Text("Image")
                Row (modifier = Modifier
                    .fillMaxHeight(0.1f)
                    .fillMaxWidth()
                    .background(Color.Black)
                    .padding(horizontal = 20.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Button(onClick = { }) {
                        Text("Crop")
                    }

                    Button(onClick = { }) {
                        Text("Polygon Crop")
                    }
                }
            }
        }
    }
}