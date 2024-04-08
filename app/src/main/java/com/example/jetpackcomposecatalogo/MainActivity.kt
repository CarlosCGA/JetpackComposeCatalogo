package com.example.jetpackcomposecatalogo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.state.ToggleableState
import androidx.compose.ui.tooling.preview.Preview
import com.example.jetpackcomposecatalogo.composables.MyArrangementColumn
import com.example.jetpackcomposecatalogo.composables.MyArrangementRow
import com.example.jetpackcomposecatalogo.composables.MyBadgeBox
import com.example.jetpackcomposecatalogo.composables.MyBalancedColumn
import com.example.jetpackcomposecatalogo.composables.MyBox
import com.example.jetpackcomposecatalogo.composables.MyCard
import com.example.jetpackcomposecatalogo.composables.MyComplexLayout
import com.example.jetpackcomposecatalogo.composables.MyDivider
import com.example.jetpackcomposecatalogo.composables.MyDropDownMenu
import com.example.jetpackcomposecatalogo.composables.MyIcon
import com.example.jetpackcomposecatalogo.composables.MyImage
import com.example.jetpackcomposecatalogo.composables.MyProgressBar
import com.example.jetpackcomposecatalogo.composables.MyRadioButton
import com.example.jetpackcomposecatalogo.composables.MyRadioButtonList
import com.example.jetpackcomposecatalogo.composables.MyRadioButtonListPro
import com.example.jetpackcomposecatalogo.composables.MyScrollableRow
import com.example.jetpackcomposecatalogo.composables.MySlider
import com.example.jetpackcomposecatalogo.composables.MySwitch
import com.example.jetpackcomposecatalogo.composables.MyWeightRow
import com.example.jetpackcomposecatalogo.composables.buttons.MyButton
import com.example.jetpackcomposecatalogo.composables.buttons.MyOutlinedButton
import com.example.jetpackcomposecatalogo.composables.buttons.MyTextButton
import com.example.jetpackcomposecatalogo.composables.checkBox.CheckBoxInfo
import com.example.jetpackcomposecatalogo.composables.checkBox.MyCheckBox
import com.example.jetpackcomposecatalogo.composables.checkBox.MyMultipleCheckBox
import com.example.jetpackcomposecatalogo.composables.checkBox.MyTriStateCheckBox
import com.example.jetpackcomposecatalogo.composables.checkBox.MyTriStateCheckBoxInfo
import com.example.jetpackcomposecatalogo.composables.checkBox.myCheckBoxList
import com.example.jetpackcomposecatalogo.composables.constraintLayout.MyConstraintLayout
import com.example.jetpackcomposecatalogo.composables.constraintLayout.MyConstraintLayoutBarrier
import com.example.jetpackcomposecatalogo.composables.constraintLayout.MyConstraintLayoutChain
import com.example.jetpackcomposecatalogo.composables.constraintLayout.MyConstraintLayoutGuideline
import com.example.jetpackcomposecatalogo.composables.dialogs.AvatarGoogleAccountItem
import com.example.jetpackcomposecatalogo.composables.dialogs.ConfirmationDialogItem
import com.example.jetpackcomposecatalogo.composables.dialogs.MyConfirmationDialog
import com.example.jetpackcomposecatalogo.composables.dialogs.MyDialog
import com.example.jetpackcomposecatalogo.composables.dialogs.MyGoogleChangeAccountDialog
import com.example.jetpackcomposecatalogo.composables.dialogs.MySimpleCustomDialog
import com.example.jetpackcomposecatalogo.composables.recyclerViews.superHero.MySuperHeroRecyclerView
import com.example.jetpackcomposecatalogo.composables.recyclerViews.superHero.MySuperHeroRecyclerViewWithButton
import com.example.jetpackcomposecatalogo.composables.texts.MyOutlinedTextField
import com.example.jetpackcomposecatalogo.composables.texts.MyText
import com.example.jetpackcomposecatalogo.composables.texts.MyTextField
import com.example.jetpackcomposecatalogo.exercises.FirstExercise
import com.example.jetpackcomposecatalogo.exercises.SecondExercise
import com.example.jetpackcomposecatalogo.ui.theme.JetpackComposeCatalogoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeCatalogoTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier
                        .fillMaxSize()
                        .verticalScroll(rememberScrollState()),
                    color = MaterialTheme.colorScheme.background
                ) {
                    AllMyContent()
                }
            }
        }
    }
}

@Composable
fun AllMyContent() {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        MyDivider(title = "MyBox")
        MyBox()

        MyDivider(title = "MyBalancedColumn")
        MyBalancedColumn()

        MyDivider(title = "MyArrangementColumn")
        MyArrangementColumn()

        //MyDivider(title = "MyScrollableColumn")
        //MyScrollableColumn()

        MyDivider(title = "MyArrangementRow")
        MyArrangementRow()

        MyDivider(title = "MyScrollableRow")
        MyScrollableRow()

        MyDivider(title = "MyWeightRow")
        MyWeightRow()

        MyDivider(title = "MyComplexLayout")
        MyComplexLayout()

        MyDivider(title = "FirstExercise")
        FirstExercise()

        MyDivider(title = "MyConstraintLayout")
        MyConstraintLayout()

        MyDivider(title = "SecondExercise")
        SecondExercise()

        MyDivider(title = "MyConstraintLayoutGuideline")
        MyConstraintLayoutGuideline()

        MyDivider(title = "MyConstraintLayoutBarrier")
        MyConstraintLayoutBarrier()

        MyDivider(title = "MyConstraintLayoutChain")
        MyConstraintLayoutChain()

        MyDivider(title = "MyFirstState")
        MyFirstState()

        MyDivider(title = "MyText")
        MyText()

        var inputText by remember { mutableStateOf(""/*"Default value (mainly empty)"*/) }
        MyDivider(title = "MyTextField")
        MyTextField(inputText, { newText -> inputText = newText }, "Name")

        var favoriteColor by remember { mutableStateOf("") }
        MyDivider(title = "MyOutlinedTextField")
        MyOutlinedTextField(
            favoriteColor,
            { newText -> favoriteColor = newText },
            "Favorite color"
        )

        MyDivider(title = "MyButton")
        MyButton()

        MyDivider(title = "MyOutlinedButton")
        MyOutlinedButton()

        MyDivider(title = "MyTextButton")
        MyTextButton()

        MyDivider(title = "MyImage")
        MyImage()

        MyDivider(title = "MyIcon")
        MyIcon()

        MyDivider(title = "MyProgressBar")
        MyProgressBar()

        MyDivider(title = "MySwitch")
        MySwitch()

        MyDivider(title = "MyCheckBox")
        MyCheckBox()

        val optionsList = listOf(
            "Do you like winter?",
            "Do you like summer?",
            "Have you got car?",
            "Have you got bike?",
            "Are you bald?"
        )
        val multipleCheckBox: List<CheckBoxInfo> =
            myCheckBoxList(titlesList = optionsList)
        var stateOfTriStateCheckBox by rememberSaveable { mutableStateOf(ToggleableState.Off) }

        val updateStateOfTriStateCheckBox: (ToggleableState) -> Unit = { newState ->
            stateOfTriStateCheckBox = newState
        }

        MyDivider(title = "MyTriStateCheckBox")
        MyTriStateCheckBox(
            MyTriStateCheckBoxInfo(
                state = stateOfTriStateCheckBox,
                updateStateOfTriStateCheckBox,
                listOfCheckBoxInfo = multipleCheckBox
            )
        )

        val onCheckBoxStateChange = {
            val isAllCheckBoxTrue = multipleCheckBox.all { checkBoxInfo ->
                checkBoxInfo.isChecked
            }
            val isAllCheckBoxFalse = multipleCheckBox.all { checkBoxInfo ->
                !checkBoxInfo.isChecked
            }
            stateOfTriStateCheckBox = if (isAllCheckBoxTrue == isAllCheckBoxFalse)
                ToggleableState.Indeterminate
            else if (isAllCheckBoxTrue)
                ToggleableState.On
            else
                ToggleableState.Off
        }
        MyDivider(title = "MyMultipleCheckBox")
        multipleCheckBox.map { checkBoxInfo ->
            MyMultipleCheckBox(
                checkBoxInfo = checkBoxInfo,
                onCheckBoxStateChange
            )
        }

        MyDivider(title = "MyRadioButton")
        MyRadioButton()

        MyDivider(title = "MyRadioButtonList")
        MyRadioButtonList()

        var selected by remember {
            mutableStateOf("Carlos")
        }
        MyDivider(title = "MyRadioButtonListPro")
        MyRadioButtonListPro(selected) { newSelected -> selected = newSelected }

        MyDivider(title = "MyCard")
        MyCard()

        MyDivider(title = "MyBadgeBox")
        MyBadgeBox()

        val list = listOf("Fruit", "Towel", "Football", "Carlos", "Phones")
        MyDivider(title = "MyDropDownMenu")
        MyDropDownMenu(list)

        MyDivider(title = "MySlider")
        MySlider()

        /******************************************************************************************/
        /******************************************************************************************/
        /***************************          DIALOGS            **********************************/
        /******************************************************************************************/
        /******************************************************************************************/

        var basicDialogShow by remember {
            mutableStateOf(false)
        }
        MyDivider(title = "MyDialog")
        Button(onClick = { basicDialogShow = true }) {
            Text(text = "Push me for basic dialog! :)")
        }
        MyDialog(basicDialogShow, {basicDialogShow = false}, {basicDialogShow = false})

        var simpleCustomDialogShow by remember {
            mutableStateOf(false)
        }
        MyDivider(title = "MySimpleCustomDialog")
        Button(onClick = { simpleCustomDialogShow = true }) {
            Text(text = "Push me for simple custom dialog! :)")
        }
        MySimpleCustomDialog(simpleCustomDialogShow) { simpleCustomDialogShow = false }

        var googleChangeAccountDialogShow by remember {
            mutableStateOf(false)
        }
        val accounts = listOf(
            AvatarGoogleAccountItem(R.drawable.avatar, "carlos@gmail.com"),
            AvatarGoogleAccountItem(R.drawable.avatar, "example@hotmail.com"),
            AvatarGoogleAccountItem(R.drawable.avatar, "skull@gmail.com"),
        )
        MyDivider(title = "MyGoogleChangeAccountDialog")
        Button(onClick = { googleChangeAccountDialogShow = true }) {
            Text(text = "Push me for change your google account! (example)")
        }
        MyGoogleChangeAccountDialog(accounts, googleChangeAccountDialogShow) { googleChangeAccountDialogShow = false }

        var confirmationDialogShow by remember {
            mutableStateOf(false)
        }
        val items = listOf(
            ConfirmationDialogItem("None"),
            ConfirmationDialogItem("Callisto"),
            ConfirmationDialogItem("Ganymede"),
            ConfirmationDialogItem("Luna"),
            ConfirmationDialogItem("Oberon"),
            ConfirmationDialogItem("Phobos"),
            ConfirmationDialogItem("Dione"),
            ConfirmationDialogItem("Towel"),
        )
        MyDivider(title = "MyConfirmationDialog")
        Button(onClick = { confirmationDialogShow = true }) {
            Text(text = "Push me for confirmation dialog!")
        }
        MyConfirmationDialog(items, confirmationDialogShow) { confirmationDialogShow = false }

        /******************************************************************************************/
        /******************************************************************************************/


        /******************************************************************************************/
        /******************************************************************************************/
        /************************          RECYCLERVIEWS            *******************************/
        /******************************************************************************************/
        /******************************************************************************************/
        /*
        MyDivider(title = "MySimpleRecyclerView")
        MySimpleRecyclerView()
        */

        MyDivider(title = "MySuperHeroRecyclerView")
        MySuperHeroRecyclerView()

        /*
        MyDivider(title = "MySuperHeroGridView")
        MySuperHeroGridView()
        */

        MyDivider(title = "MySuperHeroRecyclerViewWithButton")
        MySuperHeroRecyclerViewWithButton()


        /******************************************************************************************/
        /******************************************************************************************/
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun PreviewMain() {
    JetpackComposeCatalogoTheme {
        // A surface container using the 'background' color from the theme
        Surface(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState()),
            color = MaterialTheme.colorScheme.background
        ) {
            AllMyContent()
        }
    }
}