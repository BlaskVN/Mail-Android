package com.example.email

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.email.adapter.EmailAdapter
import com.example.email.model.EmailModel

class MainActivity : AppCompatActivity() {

    private lateinit var newRecyclerView: RecyclerView
    private lateinit var newArrayList: ArrayList<EmailModel>
    lateinit var avatar :Array<Int>
    lateinit var tvSender : Array<String>
    lateinit var tvBody : Array<String>
    lateinit var time : Array<String>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        avatar = arrayOf(
            R.drawable.thumb0,
            R.drawable.thumb1,
            R.drawable.thumb2,
            R.drawable.thumb3,
            R.drawable.thumb4,
            R.drawable.thumb5,
            R.drawable.thumb11,
            R.drawable.thumb12,
            R.drawable.thumb13,
            R.drawable.thumb14,
            R.drawable.thumb15,
            R.drawable.thumb16,
            R.drawable.thumb17,
        )
        tvSender = arrayOf(
            "john.doe@email.com",
            "jane.smith@email.com",
            "mark.brown@email.com",
            "lucy.green@email.com",
            "susan.white@email.com",
            "paul.johnson@email.com",
            "linda.miller@email.com",
            "james.wilson@email.com",
            "nina.thompson@email.com",
            "charles.davis@email.com",
            "emma.jackson@email.com",
            "benjamin.martinez@email.com",
            "olivia.harris@email.com",
            "noah.lewis@email.com",
            "ava.robinson@email.com",
            "isabella.clark@email.com",
            "ethan.walker@email.com"
        )
        tvBody = arrayOf(
            "Hi John, I hope you're doing well. Just wanted to follow up on our meeting next week.",
            "Hello Jane, I wanted to share the project updates with you. Let me know your thoughts.",
            "Hi Mark, it was great catching up yesterday! Looking forward to collaborating on the new project.",
            "Dear Lucy, thank you for your insights during the last team meeting. I appreciate your input!",
            "Hi Susan, I just wanted to confirm our lunch appointment on Friday. Looking forward to it!",
            "Hey Paul, I hope you're having a great day! I wanted to check on the status of the report.",
            "Hi Linda, just a reminder about the deadline for the project proposal next week.",
            "Hello James, it was a pleasure meeting you at the conference. Let’s connect soon.",
            "Dear Nina, I hope you enjoyed your vacation! Let’s catch up when you’re back.",
            "Hi Charles, thanks for your help with the presentation last week. It went really well!",
            "Hi Emma, I’m excited about the new marketing strategy we discussed. Let’s finalize the details soon.",
            "Hello Benjamin, just following up on the budget review meeting scheduled for tomorrow.",
            "Hi Olivia, I wanted to get your feedback on the design mockups I sent over.",
            "Hey Noah, great job on the project! I’d love to hear more about your approach.",
            "Hi Ava, thanks for your assistance with the client meeting last week. It was very helpful!",
            "Dear Isabella, I wanted to share some resources that might help with your research project.",
            "Hi Ethan, I hope all is well! Can we schedule a time to discuss the upcoming deadlines?"
        )
        time = arrayOf(
            "08:30 AM",
            "02:45 PM",
            "09:15 AM",
            "11:00 AM",
            "01:30 PM",
            "07:50 AM",
            "03:20 PM",
            "10:10 AM",
            "12:00 PM",
            "05:45 PM",
            "04:30 PM",
            "06:00 PM",
            "09:00 AM",
            "07:15 PM",
            "08:00 PM",
            "08:45 AM",
            "02:30 PM"
        )
        newRecyclerView = findViewById(R.id.recyclerView)
        newRecyclerView.layoutManager = LinearLayoutManager(this)
        newArrayList = arrayListOf<EmailModel>()
        getUserdata()

        }

    private fun getUserdata() {
        for(i in avatar.indices){
            val emails = EmailModel(tvSender[i],tvBody[i],time[i],avatar[i])
            newArrayList.add(emails)
        }
        newRecyclerView.adapter = EmailAdapter(newArrayList)
    }


}
