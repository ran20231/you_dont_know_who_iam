package com.forsale.app.utils;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: SpaceItemDecoration.kt */
/* loaded from: classes3.dex */
public final class a0 extends RecyclerView.n {

    /* renamed from: a  reason: collision with root package name */
    private final int f39705a;

    /* renamed from: b  reason: collision with root package name */
    private final int f39706b;

    /* renamed from: c  reason: collision with root package name */
    private final int f39707c;

    public a0(int i11, int i12, int i13) {
        this.f39705a = i11;
        this.f39706b = i12;
        this.f39707c = i13;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.z state) {
        kotlin.jvm.internal.o.i(outRect, "outRect");
        kotlin.jvm.internal.o.i(view, "view");
        kotlin.jvm.internal.o.i(parent, "parent");
        kotlin.jvm.internal.o.i(state, "state");
        if (parent.getAdapter() == null) {
            return;
        }
        outRect.bottom = this.f39705a;
        int j02 = parent.j0(view);
        RecyclerView.Adapter adapter = parent.getAdapter();
        kotlin.jvm.internal.o.f(adapter);
        if (j02 == adapter.getItemCount() - 1) {
            outRect.bottom = this.f39707c;
        }
        if (parent.j0(view) == 0) {
            outRect.top = this.f39706b;
        }
    }

    public /* synthetic */ a0(int i11, int i12, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this((i14 & 1) != 0 ? 0 : i11, (i14 & 2) != 0 ? 0 : i12, (i14 & 4) != 0 ? 0 : i13);
    }
}
