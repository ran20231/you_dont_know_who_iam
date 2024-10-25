package com.forsale.app.features.more.notifications;

import aa.k8;
import android.os.Bundle;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.forsale.app.base.fragments.a;
import com.forsale.app.features.more.notifications.NotificationMainScreen;
import com.forsale.app.utils.LocaleManager;
import kotlin.d;
import kotlin.jvm.internal.o;
import t9.t0;
import wz.h;
/* compiled from: NotificationMainScreen.kt */
/* loaded from: classes2.dex */
public final class NotificationMainScreen extends a<k8> {

    /* renamed from: g  reason: collision with root package name */
    private final h f32622g;

    public NotificationMainScreen() {
        h a11;
        a11 = d.a(new g00.a<ae.a>() { // from class: com.forsale.app.features.more.notifications.NotificationMainScreen$adapter$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final ae.a invoke() {
                return new ae.a(NotificationMainScreen.this);
            }
        });
        this.f32622g = a11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y(NotificationMainScreen this$0, View view) {
        o.i(this$0, "this$0");
        androidx.navigation.fragment.a.a(this$0).h0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z(int i11, View page, float f11) {
        o.i(page, "page");
        page.setRotationY(i11);
    }

    @Override // com.forsale.app.base.fragments.a
    protected int o() {
        return t0.G1;
    }

    @Override // com.forsale.app.base.fragments.a, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        final int i11;
        o.i(view, "view");
        super.onViewCreated(view, bundle);
        m().S.setAdapter(x());
        m().P.setOnClickListener(new View.OnClickListener() { // from class: ae.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                NotificationMainScreen.y(NotificationMainScreen.this, view2);
            }
        });
        if (LocaleManager.f39597a.r()) {
            i11 = 180;
        } else {
            i11 = 0;
        }
        m().S.setRotationY(i11);
        m().S.U(false, new ViewPager.k() { // from class: ae.c
            @Override // androidx.viewpager.widget.ViewPager.k
            public final void a(View view2, float f11) {
                NotificationMainScreen.z(i11, view2, f11);
            }
        });
        m().T.setupWithViewPager(m().S);
    }

    public final ae.a x() {
        return (ae.a) this.f32622g.getValue();
    }
}
