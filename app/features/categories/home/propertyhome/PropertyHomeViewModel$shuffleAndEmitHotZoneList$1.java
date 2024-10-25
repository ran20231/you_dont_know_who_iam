package com.forsale.app.features.categories.home.propertyhome;

import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PropertyHomeViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.home.propertyhome.PropertyHomeViewModel$shuffleAndEmitHotZoneList$1", f = "PropertyHomeViewModel.kt", l = {143, 154, 166, 183, 186}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class PropertyHomeViewModel$shuffleAndEmitHotZoneList$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    Object f24851a;

    /* renamed from: b  reason: collision with root package name */
    int f24852b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ PropertyHomeViewModel f24853c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PropertyHomeViewModel$shuffleAndEmitHotZoneList$1(PropertyHomeViewModel propertyHomeViewModel, zz.a<? super PropertyHomeViewModel$shuffleAndEmitHotZoneList$1> aVar) {
        super(2, aVar);
        this.f24853c = propertyHomeViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new PropertyHomeViewModel$shuffleAndEmitHotZoneList$1(this.f24853c, aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00c1 A[Catch: all -> 0x002b, LOOP:0: B:34:0x00bb->B:36:0x00c1, LOOP_END, TryCatch #0 {all -> 0x002b, blocks: (B:12:0x0026, B:18:0x0037, B:33:0x00a8, B:34:0x00bb, B:36:0x00c1, B:37:0x011c, B:24:0x0053, B:26:0x008b, B:30:0x0099, B:40:0x0180), top: B:48:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x017f A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instructions count: 427
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.home.propertyhome.PropertyHomeViewModel$shuffleAndEmitHotZoneList$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((PropertyHomeViewModel$shuffleAndEmitHotZoneList$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
