package com.forsale.app.ui;

import aa.a0;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import com.forsale.app.base.activities.BasePlainActivity;
import com.forsale.app.utils.t;
import com.forsale.app.utils.u;
import g00.l;
import java.util.List;
import kotlin.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;
import n00.k;
import t9.t0;
import t9.y0;
import u00.a;
import wz.h;
import wz.p;
/* compiled from: QRScannerActivity.kt */
/* loaded from: classes3.dex */
public final class QRScannerActivity extends BasePlainActivity<a0> implements a.b {

    /* renamed from: d  reason: collision with root package name */
    private final int f37830d = t0.f70259n;

    /* renamed from: e  reason: collision with root package name */
    private final h f37831e;

    /* renamed from: f  reason: collision with root package name */
    private final t f37832f;

    /* renamed from: h  reason: collision with root package name */
    static final /* synthetic */ k<Object>[] f37828h = {s.g(new PropertyReference1Impl(QRScannerActivity.class, "cameraPermission", "getCameraPermission()Lcom/forsale/app/utils/PermissionsManager;", 0))};

    /* renamed from: g  reason: collision with root package name */
    public static final a f37827g = new a(null);

    /* renamed from: i  reason: collision with root package name */
    public static final int f37829i = 8;

    /* compiled from: QRScannerActivity.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(Activity activity, int i11) {
            o.i(activity, "activity");
            activity.startActivityForResult(new Intent(activity, QRScannerActivity.class), i11);
        }

        public final void b(Fragment fragment, int i11) {
            o.i(fragment, "fragment");
            fragment.startActivityForResult(new Intent(fragment.getContext(), QRScannerActivity.class), i11);
        }
    }

    public QRScannerActivity() {
        h a11;
        a11 = d.a(new g00.a<u00.a>() { // from class: com.forsale.app.ui.QRScannerActivity$scannerView$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final u00.a invoke() {
                return new u00.a(QRScannerActivity.this);
            }
        });
        this.f37831e = a11;
        this.f37832f = t.f40536d.a(222, "android.permission.CAMERA");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s0() {
        o0().O.addView(u0());
    }

    private final u t0() {
        return this.f37832f.a(this, f37828h[0]);
    }

    private final u00.a u0() {
        return (u00.a) this.f37831e.getValue();
    }

    @Override // u00.a.b
    public void X(dq.h hVar) {
        Intent intent = new Intent();
        intent.putExtra("QR_RESULT_KEY", String.valueOf(hVar));
        setResult(-1, intent);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.forsale.app.base.activities.BasePlainActivity, androidx.fragment.app.p, androidx.activity.ComponentActivity, androidx.core.app.l, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setSupportActionBar(o0().P);
        androidx.appcompat.app.a supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.D(getString(y0.f70644qd));
        }
        u.g(t0(), null, new g00.a<p>() { // from class: com.forsale.app.ui.QRScannerActivity$onCreate$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // g00.a
            public /* bridge */ /* synthetic */ p invoke() {
                invoke2();
                return p.f75480a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                QRScannerActivity.this.s0();
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.p, android.app.Activity
    public void onPause() {
        super.onPause();
        u0().g();
    }

    @Override // androidx.fragment.app.p, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i11, String[] permissions, int[] grantResults) {
        o.i(permissions, "permissions");
        o.i(grantResults, "grantResults");
        super.onRequestPermissionsResult(i11, permissions, grantResults);
        t0().d(i11, permissions, grantResults, new l<List<? extends String>, p>() { // from class: com.forsale.app.ui.QRScannerActivity$onRequestPermissionsResult$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            public final void b(List<String> it2) {
                o.i(it2, "it");
                Toast.makeText(QRScannerActivity.this, y0.Db, 1).show();
                QRScannerActivity.this.finish();
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ p invoke(List<? extends String> list) {
                b(list);
                return p.f75480a;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.p, android.app.Activity
    public void onResume() {
        super.onResume();
        u0().setResultHandler(this);
        u0().e();
    }

    @Override // androidx.appcompat.app.d
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return super.onSupportNavigateUp();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.forsale.app.base.activities.BasePlainActivity
    public int p0() {
        return this.f37830d;
    }
}
