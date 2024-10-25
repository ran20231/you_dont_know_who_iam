package com.forsale.app.utils;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavBackStackEntry;
import kotlin.jvm.internal.Lambda;
/* compiled from: NavGraphViewModelLazy.kt */
/* loaded from: classes3.dex */
public final class ViewModelHiltExtensionKt$assistedNavGraphViewModel$$inlined$navGraphViewModels$default$1 extends Lambda implements g00.a<NavBackStackEntry> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Fragment f39687a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f39688b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewModelHiltExtensionKt$assistedNavGraphViewModel$$inlined$navGraphViewModels$default$1(Fragment fragment, int i11) {
        super(0);
        this.f39687a = fragment;
        this.f39688b = i11;
    }

    @Override // g00.a
    /* renamed from: b */
    public final NavBackStackEntry invoke() {
        return androidx.navigation.fragment.a.a(this.f39687a).A(this.f39688b);
    }
}
