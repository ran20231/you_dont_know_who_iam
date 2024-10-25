package com.forsale.app.utils;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: HorizontalSpaceItemDecoration.kt */
/* loaded from: classes3.dex */
public final class q extends RecyclerView.n {

    /* renamed from: a  reason: collision with root package name */
    private final int f40529a;

    /* renamed from: b  reason: collision with root package name */
    private final int f40530b;

    /* renamed from: c  reason: collision with root package name */
    private final int f40531c;

    public /* synthetic */ q(int i11, int i12, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this((i14 & 1) != 0 ? 0 : i11, (i14 & 2) != 0 ? 0 : i12, (i14 & 4) != 0 ? 0 : i13);
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
        LocaleManager localeManager = LocaleManager.f39597a;
        if (localeManager.r()) {
            outRect.left = this.f40529a;
        } else {
            outRect.right = this.f40529a;
        }
        int j02 = parent.j0(view);
        RecyclerView.Adapter adapter = parent.getAdapter();
        kotlin.jvm.internal.o.f(adapter);
        if (j02 == adapter.getItemCount() - 1) {
            if (localeManager.r()) {
                outRect.left = this.f40531c;
            } else {
                outRect.right = this.f40531c;
            }
        }
        if (parent.j0(view) == 0) {
            if (localeManager.r()) {
                outRect.right = this.f40530b;
            } else {
                outRect.left = this.f40530b;
            }
        }
    }

    public q(int i11, int i12, int i13) {
        this.f40529a = i11;
        this.f40530b = i12;
        this.f40531c = i13;
    }
}
