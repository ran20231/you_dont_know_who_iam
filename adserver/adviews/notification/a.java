package com.forsale.adserver.adviews.notification;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.forsale.adserver.adviews.notification.NotificationView;
import g9.c;
import java.util.ArrayList;
import kotlin.jvm.internal.o;
import t8.q;
/* compiled from: NotificationAdapter.kt */
/* loaded from: classes2.dex */
public final class a extends RecyclerView.Adapter<RecyclerView.d0> {

    /* renamed from: a */
    private ArrayList<c> f20603a;

    /* compiled from: NotificationAdapter.kt */
    /* renamed from: com.forsale.adserver.adviews.notification.a$a */
    /* loaded from: classes2.dex */
    public final class C0229a extends RecyclerView.d0 {

        /* renamed from: a */
        private final q f20604a;

        /* renamed from: b */
        final /* synthetic */ a f20605b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0229a(a aVar, q binding) {
            super(binding.getRoot());
            o.i(binding, "binding");
            this.f20605b = aVar;
            this.f20604a = binding;
        }

        public final void a(c notificationItem) {
            o.i(notificationItem, "notificationItem");
            this.f20604a.O.c(notificationItem.b());
            this.f20604a.P.setText(notificationItem.a());
        }
    }

    public a(ArrayList<c> notifications, NotificationView.a aVar) {
        o.i(notifications, "notifications");
        this.f20603a = notifications;
    }

    public static final void d(a this$0, c currentItem, View view) {
        o.i(this$0, "this$0");
        o.i(currentItem, "$currentItem");
        this$0.getClass();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f20603a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.d0 holder, int i11) {
        o.i(holder, "holder");
        c cVar = this.f20603a.get(i11);
        o.h(cVar, "get(...)");
        c cVar2 = cVar;
        ((C0229a) holder).a(cVar2);
        holder.itemView.setOnClickListener(new q8.a(this, cVar2));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.d0 onCreateViewHolder(ViewGroup parent, int i11) {
        o.i(parent, "parent");
        q f02 = q.f0(LayoutInflater.from(parent.getContext()), parent, false);
        o.h(f02, "inflate(...)");
        return new C0229a(this, f02);
    }
}
