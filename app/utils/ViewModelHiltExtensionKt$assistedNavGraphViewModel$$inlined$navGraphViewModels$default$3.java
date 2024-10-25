package com.forsale.app.utils;

import androidx.navigation.NavBackStackEntry;
import kotlin.jvm.internal.Lambda;
/* compiled from: NavGraphViewModelLazy.kt */
/* loaded from: classes3.dex */
public final class ViewModelHiltExtensionKt$assistedNavGraphViewModel$$inlined$navGraphViewModels$default$3 extends Lambda implements g00.a<w3.a> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ g00.a f39690a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ wz.h f39691b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewModelHiltExtensionKt$assistedNavGraphViewModel$$inlined$navGraphViewModels$default$3(g00.a aVar, wz.h hVar) {
        super(0);
        this.f39690a = aVar;
        this.f39691b = hVar;
    }

    @Override // g00.a
    /* renamed from: b */
    public final w3.a invoke() {
        NavBackStackEntry b11;
        w3.a aVar;
        g00.a aVar2 = this.f39690a;
        if (aVar2 == null || (aVar = (w3.a) aVar2.invoke()) == null) {
            b11 = z3.p.b(this.f39691b);
            return b11.getDefaultViewModelCreationExtras();
        }
        return aVar;
    }
}
