package com.forsale.app.utils;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: GridSpacingItemDecoration.kt */
/* loaded from: classes3.dex */
public final class p extends RecyclerView.n {

    /* renamed from: a  reason: collision with root package name */
    private final int f40386a;

    /* renamed from: b  reason: collision with root package name */
    private final int f40387b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f40388c;

    public p(int i11, int i12, boolean z11) {
        this.f40386a = i11;
        this.f40387b = i12;
        this.f40388c = z11;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.z state) {
        kotlin.jvm.internal.o.i(outRect, "outRect");
        kotlin.jvm.internal.o.i(view, "view");
        kotlin.jvm.internal.o.i(parent, "parent");
        kotlin.jvm.internal.o.i(state, "state");
        int j02 = parent.j0(view);
        int i11 = this.f40386a;
        int i12 = j02 % i11;
        if (this.f40388c) {
            int i13 = this.f40387b;
            outRect.left = i13 - ((i12 * i13) / i11);
            outRect.right = ((i12 + 1) * i13) / i11;
            if (j02 < i11) {
                outRect.top = i13;
            }
            outRect.bottom = i13;
            return;
        }
        int i14 = this.f40387b;
        outRect.left = (i12 * i14) / i11;
        outRect.right = i14 - (((i12 + 1) * i14) / i11);
        if (j02 >= i11) {
            outRect.top = i14;
        }
    }

    public /* synthetic */ p(int i11, int i12, boolean z11, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, i12, (i13 & 4) != 0 ? false : z11);
    }
}
