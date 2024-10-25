package com.forsale.app.utils;

import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.x0;
import kotlin.jvm.internal.Lambda;
import w3.a;
/* compiled from: FragmentViewModelLazy.kt */
/* loaded from: classes3.dex */
public final class ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$7 extends Lambda implements g00.a<w3.a> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ g00.a f39698a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ wz.h f39699b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$7(g00.a aVar, wz.h hVar) {
        super(0);
        this.f39698a = aVar;
        this.f39699b = hVar;
    }

    @Override // g00.a
    /* renamed from: b */
    public final w3.a invoke() {
        x0 c11;
        androidx.lifecycle.l lVar;
        w3.a aVar;
        g00.a aVar2 = this.f39698a;
        if (aVar2 == null || (aVar = (w3.a) aVar2.invoke()) == null) {
            c11 = FragmentViewModelLazyKt.c(this.f39699b);
            if (c11 instanceof androidx.lifecycle.l) {
                lVar = (androidx.lifecycle.l) c11;
            } else {
                lVar = null;
            }
            if (lVar != null) {
                return lVar.getDefaultViewModelCreationExtras();
            }
            return a.C0905a.f75031b;
        }
        return aVar;
    }
}
