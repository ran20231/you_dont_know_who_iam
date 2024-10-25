package com.forsale.app.features.postad.extraattributes;

import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PostAdAttributesViewModel.kt */
@d(c = "com.forsale.app.features.postad.extraattributes.PostAdAttributesViewModel$validAttributes$1", f = "PostAdAttributesViewModel.kt", l = {86, 90, 91}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class PostAdAttributesViewModel$validAttributes$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f35174a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ PostAdAttributesViewModel f35175b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostAdAttributesViewModel$validAttributes$1(PostAdAttributesViewModel postAdAttributesViewModel, zz.a<? super PostAdAttributesViewModel$validAttributes$1> aVar) {
        super(2, aVar);
        this.f35175b = postAdAttributesViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new PostAdAttributesViewModel$validAttributes$1(this.f35175b, aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0074 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.f()
            int r1 = r5.f35174a
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L25
            if (r1 == r4) goto L21
            if (r1 == r3) goto L1d
            if (r1 != r2) goto L15
            kotlin.f.b(r6)
            goto L75
        L15:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1d:
            kotlin.f.b(r6)
            goto L57
        L21:
            kotlin.f.b(r6)
            goto L33
        L25:
            kotlin.f.b(r6)
            com.forsale.app.features.postad.extraattributes.PostAdAttributesViewModel r6 = r5.f35175b
            r5.f35174a = r4
            java.lang.Object r6 = com.forsale.app.features.postad.extraattributes.PostAdAttributesViewModel.B0(r6, r5)
            if (r6 != r0) goto L33
            return r0
        L33:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L46
            com.forsale.app.features.postad.extraattributes.PostAdAttributesViewModel r6 = r5.f35175b
            r6.d1()
            com.forsale.app.features.postad.extraattributes.PostAdAttributesViewModel r6 = r5.f35175b
            com.forsale.app.features.postad.extraattributes.PostAdAttributesViewModel.C0(r6)
            goto L75
        L46:
            com.forsale.app.features.postad.extraattributes.PostAdAttributesViewModel r6 = r5.f35175b
            kotlinx.coroutines.flow.MutableSharedFlow r6 = com.forsale.app.features.postad.extraattributes.PostAdAttributesViewModel.A0(r6)
            wz.p r1 = wz.p.f75480a
            r5.f35174a = r3
            java.lang.Object r6 = r6.emit(r1, r5)
            if (r6 != r0) goto L57
            return r0
        L57:
            com.forsale.app.features.postad.extraattributes.PostAdAttributesViewModel r6 = r5.f35175b
            kotlinx.coroutines.flow.MutableSharedFlow r6 = r6.j0()
            com.forsale.app.features.postad.extraattributes.PostAdAttributesViewModel r1 = r5.f35175b
            com.forsale.app.datalayer.repositories.ApplicationResourcesRepository r1 = r1.P0()
            int r3 = t9.y0.F4
            r4 = 0
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r1 = r1.getString(r3, r4)
            r5.f35174a = r2
            java.lang.Object r6 = r6.emit(r1, r5)
            if (r6 != r0) goto L75
            return r0
        L75:
            wz.p r6 = wz.p.f75480a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.postad.extraattributes.PostAdAttributesViewModel$validAttributes$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((PostAdAttributesViewModel$validAttributes$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
