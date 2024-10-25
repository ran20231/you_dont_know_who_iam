package com.forsale.app.ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import kotlin.jvm.internal.o;
/* compiled from: ListingFabBehavior.kt */
/* loaded from: classes3.dex */
public final class ListingFabBehavior extends CoordinatorLayout.c<FloatingActionButton> {

    /* compiled from: ListingFabBehavior.kt */
    /* loaded from: classes3.dex */
    public static final class a extends FloatingActionButton.b {
        a() {
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.b
        @SuppressLint({"RestrictedApi"})
        public void a(FloatingActionButton fab) {
            o.i(fab, "fab");
            super.a(fab);
            fab.setVisibility(4);
        }
    }

    public ListingFabBehavior(Context ctx, AttributeSet attrs) {
        o.i(ctx, "ctx");
        o.i(attrs, "attrs");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    /* renamed from: e */
    public void onNestedScroll(CoordinatorLayout coordinatorLayout, FloatingActionButton child, View target, int i11, int i12, int i13, int i14, int i15) {
        o.i(coordinatorLayout, "coordinatorLayout");
        o.i(child, "child");
        o.i(target, "target");
        super.onNestedScroll(coordinatorLayout, child, target, i11, i12, i13, i14, i15);
        if (i12 == 0 && i14 < 0 && child.getVisibility() == 0) {
            child.n(new a());
        } else if (i12 > 0 && child.getVisibility() != 0) {
            child.t();
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    /* renamed from: f */
    public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, FloatingActionButton child, View directTargetChild, View target, int i11, int i12) {
        o.i(coordinatorLayout, "coordinatorLayout");
        o.i(child, "child");
        o.i(directTargetChild, "directTargetChild");
        o.i(target, "target");
        return true;
    }
}
