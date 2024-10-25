package com.forsale.app.ui.bottomsheets.attributes;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.forsale.app.utils.LifeCycleUtilsKt;
import com.google.android.material.bottomsheet.d;
import fg.b;
import kotlin.jvm.internal.o;
import t9.r0;
import t9.t0;
import t9.z0;
import ue.g;
/* compiled from: AttributeOptionsBottomSheet.kt */
@SuppressLint({"ValidFragment"})
/* loaded from: classes3.dex */
public final class AttributeOptionsBottomSheet extends d {

    /* renamed from: b  reason: collision with root package name */
    private final AttributeOptionsViewModel f38013b;

    /* renamed from: c  reason: collision with root package name */
    private final g f38014c;

    public AttributeOptionsBottomSheet(AttributeOptionsViewModel viewModel, g callBack) {
        o.i(viewModel, "viewModel");
        o.i(callBack, "callBack");
        this.f38013b = viewModel;
        this.f38014c = callBack;
    }

    @Override // androidx.fragment.app.j
    public int getTheme() {
        return z0.f70792b;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.i(inflater, "inflater");
        View inflate = inflater.inflate(t0.M, viewGroup, false);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(r0.X6);
        Context context = recyclerView.getContext();
        if (context != null) {
            o.f(context);
            recyclerView.setLayoutManager(new LinearLayoutManager(new Activity()));
            recyclerView.setAdapter(new b(this.f38013b));
            recyclerView.setHasFixedSize(true);
            LifeCycleUtilsKt.b(this, new AttributeOptionsBottomSheet$onCreateView$1$1$1$1(this, null));
            LifeCycleUtilsKt.b(this, new AttributeOptionsBottomSheet$onCreateView$1$1$1$2(this, null));
        }
        return inflate;
    }

    public final g q() {
        return this.f38014c;
    }

    public final AttributeOptionsViewModel r() {
        return this.f38013b;
    }
}
