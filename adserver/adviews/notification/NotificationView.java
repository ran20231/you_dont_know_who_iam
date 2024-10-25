package com.forsale.adserver.adviews.notification;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i;
import java.util.ArrayList;
import kotlin.jvm.internal.o;
/* compiled from: NotificationView.kt */
/* loaded from: classes2.dex */
public final class NotificationView extends RecyclerView {

    /* renamed from: c1  reason: collision with root package name */
    private com.forsale.adserver.adviews.notification.a f20602c1;

    /* compiled from: NotificationView.kt */
    /* loaded from: classes2.dex */
    public interface a {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationView(Context context, AttributeSet attrs) {
        super(context, attrs);
        o.i(context, "context");
        o.i(attrs, "attrs");
        L1();
    }

    public final View L1() {
        setLayoutManager(new LinearLayoutManager(getContext()));
        setHasFixedSize(true);
        setNestedScrollingEnabled(false);
        j(new i(getContext(), 1));
        com.forsale.adserver.adviews.notification.a aVar = new com.forsale.adserver.adviews.notification.a(new ArrayList(), null);
        this.f20602c1 = aVar;
        setAdapter(aVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }
}
