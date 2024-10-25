package com.forsale.app.features.maincontainer;

import android.content.Intent;
import android.os.Bundle;
import com.google.firebase.perf.metrics.Trace;
/* compiled from: LauncherActivity.kt */
/* loaded from: classes2.dex */
public final class LauncherActivity extends androidx.appcompat.app.d {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.p, androidx.activity.ComponentActivity, androidx.core.app.l, android.app.Activity
    public void onCreate(Bundle bundle) {
        Trace e11 = cp.e.e("appStart_onCreate_activity_launcher");
        super.onCreate(bundle);
        Intent intent = new Intent(this, MainContainerActivity.class);
        intent.setData(getIntent().getData());
        intent.setFlags(268451840);
        startActivity(intent);
        finish();
        e11.stop();
    }
}
