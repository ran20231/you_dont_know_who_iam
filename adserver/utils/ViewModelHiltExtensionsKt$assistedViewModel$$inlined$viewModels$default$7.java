package com.forsale.adserver.utils;

import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.l;
import androidx.lifecycle.x0;
import kotlin.jvm.internal.Lambda;
import w3.a;
import wz.h;
/* compiled from: FragmentViewModelLazy.kt */
/* loaded from: classes2.dex */
public final class ViewModelHiltExtensionsKt$assistedViewModel$$inlined$viewModels$default$7 extends Lambda implements g00.a<w3.a> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ g00.a f20870a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ h f20871b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewModelHiltExtensionsKt$assistedViewModel$$inlined$viewModels$default$7(g00.a aVar, h hVar) {
        super(0);
        this.f20870a = aVar;
        this.f20871b = hVar;
    }

    @Override // g00.a
    /* renamed from: b */
    public final w3.a invoke() {
        x0 c11;
        l lVar;
        w3.a aVar;
        g00.a aVar2 = this.f20870a;
        if (aVar2 == null || (aVar = (w3.a) aVar2.invoke()) == null) {
            c11 = FragmentViewModelLazyKt.c(this.f20871b);
            if (c11 instanceof l) {
                lVar = (l) c11;
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
