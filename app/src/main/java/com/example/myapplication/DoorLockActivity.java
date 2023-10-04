package com.example.myapplication;

import android.app.Activity;
import android.widget.ImageView;

import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

public class DoorLockActivity extends Activity {
    ImageView img_test = findViewById(R.id.imageView2);

    FirebaseStorage storage = FirebaseStorage.getInstance("gs://...storage 주소");
    StorageReference storageRef = storage.getReference();
        storageRef.child("images/test.jpg").getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
        @Override
        public void onSuccess(Uri uri) {
            //이미지 로드 성공시

            Glide.with(getApplicationContext())
                    .load(uri)
                    .into(img_test);

        }
    }).addOnFailureListener(new OnFailureListener() {
        @Override
        public void onFailure(@NonNull Exception exception) {
            //이미지 로드 실패시
            Toast.makeText(getApplicationContext(), "실패", Toast.LENGTH_SHORT).show();
        }
    });
}
