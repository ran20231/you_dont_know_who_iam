package com.forsale.app.features.postad.plans;

import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PostAdPlansViewModel.kt */
@d(c = "com.forsale.app.features.postad.plans.PostAdPlansViewModel$getPlans$1", f = "PostAdPlansViewModel.kt", l = {76, 74, 82}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class PostAdPlansViewModel$getPlans$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    Object f36381a;

    /* renamed from: b  reason: collision with root package name */
    Object f36382b;

    /* renamed from: c  reason: collision with root package name */
    Object f36383c;

    /* renamed from: d  reason: collision with root package name */
    int f36384d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ PostAdPlansViewModel f36385e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostAdPlansViewModel$getPlans$1(PostAdPlansViewModel postAdPlansViewModel, zz.a<? super PostAdPlansViewModel$getPlans$1> aVar) {
        super(2, aVar);
        this.f36385e = postAdPlansViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new PostAdPlansViewModel$getPlans$1(this.f36385e, aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00a0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a1  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.f()
            int r1 = r8.f36384d
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L32
            if (r1 == r4) goto L2a
            if (r1 == r3) goto L26
            if (r1 != r2) goto L1e
            java.lang.Object r0 = r8.f36383c
            com.forsale.app.datalayer.network.responses.PlansResponse r0 = (com.forsale.app.datalayer.network.responses.PlansResponse) r0
            java.lang.Object r1 = r8.f36382b
            com.forsale.app.features.postad.plans.PostAdPlansViewModel r1 = (com.forsale.app.features.postad.plans.PostAdPlansViewModel) r1
            kotlin.f.b(r9)
            goto La2
        L1e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L26:
            kotlin.f.b(r9)
            goto L71
        L2a:
            java.lang.Object r1 = r8.f36381a
            com.forsale.app.datalayer.network.services.PlansServices r1 = (com.forsale.app.datalayer.network.services.PlansServices) r1
            kotlin.f.b(r9)
            goto L48
        L32:
            kotlin.f.b(r9)
            com.forsale.app.features.postad.plans.PostAdPlansViewModel r9 = r8.f36385e
            com.forsale.app.datalayer.network.services.PlansServices r1 = com.forsale.app.features.postad.plans.PostAdPlansViewModel.w0(r9)
            com.forsale.app.utils.LocaleManager r9 = com.forsale.app.utils.LocaleManager.f39597a
            r8.f36381a = r1
            r8.f36384d = r4
            java.lang.Object r9 = r9.h(r8)
            if (r9 != r0) goto L48
            return r0
        L48:
            java.lang.String r9 = (java.lang.String) r9
            com.forsale.app.features.postad.plans.PostAdPlansViewModel r5 = r8.f36385e
            com.forsale.app.features.postad.PostAdViewModel r5 = com.forsale.app.features.postad.plans.PostAdPlansViewModel.x0(r5)
            com.forsale.app.datalayer.network.entities.ListingDetailsEntity r5 = r5.n2()
            r6 = 0
            if (r5 == 0) goto L5c
            java.lang.Integer r5 = r5.getCategoryId()
            goto L5d
        L5c:
            r5 = r6
        L5d:
            java.lang.String r5 = java.lang.String.valueOf(r5)
            com.forsale.app.datalayer.network.requestsbodies.GetPlansBody r7 = new com.forsale.app.datalayer.network.requestsbodies.GetPlansBody
            r7.<init>(r9, r5)
            r8.f36381a = r6
            r8.f36384d = r3
            java.lang.Object r9 = r1.getPlansService(r7, r8)
            if (r9 != r0) goto L71
            return r0
        L71:
            com.forsale.app.features.postad.plans.PostAdPlansViewModel r1 = r8.f36385e
            r3 = r9
            com.forsale.app.datalayer.network.responses.PlansResponse r3 = (com.forsale.app.datalayer.network.responses.PlansResponse) r3
            androidx.lifecycle.b0 r5 = r1.v0()
            com.forsale.app.base.ViewStates r6 = com.forsale.app.base.ViewStates.CONTENT
            r5.postValue(r6)
            androidx.lifecycle.b0 r5 = r1.E0()
            java.util.List r6 = r3.getPlans()
            r5.postValue(r6)
            kotlinx.coroutines.flow.MutableStateFlow r5 = com.forsale.app.features.postad.plans.PostAdPlansViewModel.y0(r1)
            java.lang.String r6 = r3.getReadMoreUrl()
            r8.f36381a = r9
            r8.f36382b = r1
            r8.f36383c = r3
            r8.f36384d = r2
            java.lang.Object r9 = r5.emit(r6, r8)
            if (r9 != r0) goto La1
            return r0
        La1:
            r0 = r3
        La2:
            androidx.lifecycle.b0 r9 = r1.D0()
            java.lang.String r0 = r0.getDescription()
            r9.postValue(r0)
            com.forsale.app.features.postad.plans.PostAdPlansViewModel.z0(r1, r4)
            wz.p r9 = wz.p.f75480a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.postad.plans.PostAdPlansViewModel$getPlans$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((PostAdPlansViewModel$getPlans$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
