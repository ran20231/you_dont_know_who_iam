package com.forsale.app.features.categories.home.homelandingscreen;

import com.forsale.app.datalayer.database.CategoryEntity;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: VerticalViewModel.kt */
@d(c = "com.forsale.app.features.categories.home.homelandingscreen.VerticalViewModel$fetchHomeScreenData$1", f = "VerticalViewModel.kt", l = {247, 248}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class VerticalViewModel$fetchHomeScreenData$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    Object f23978a;

    /* renamed from: b  reason: collision with root package name */
    int f23979b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ CategoryEntity f23980c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ VerticalViewModel f23981d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ boolean f23982e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerticalViewModel$fetchHomeScreenData$1(CategoryEntity categoryEntity, VerticalViewModel verticalViewModel, boolean z11, zz.a<? super VerticalViewModel$fetchHomeScreenData$1> aVar) {
        super(2, aVar);
        this.f23980c = categoryEntity;
        this.f23981d = verticalViewModel;
        this.f23982e = z11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new VerticalViewModel$fetchHomeScreenData$1(this.f23980c, this.f23981d, this.f23982e, aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005b A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.f()
            int r1 = r6.f23979b
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L22
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            kotlin.f.b(r7)
            goto L5c
        L12:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1a:
            java.lang.Object r1 = r6.f23978a
            com.forsale.app.features.categories.home.homelandingscreen.VerticalViewModel r1 = (com.forsale.app.features.categories.home.homelandingscreen.VerticalViewModel) r1
            kotlin.f.b(r7)
            goto L4a
        L22:
            kotlin.f.b(r7)
            com.forsale.app.datalayer.database.CategoryEntity r7 = r6.f23980c
            if (r7 != 0) goto L2f
            com.forsale.app.features.categories.home.homelandingscreen.VerticalViewModel r7 = r6.f23981d
            com.forsale.app.datalayer.database.CategoryEntity r7 = com.forsale.app.features.categories.home.homelandingscreen.VerticalViewModel.y0(r7)
        L2f:
            if (r7 == 0) goto L5c
            com.forsale.app.features.categories.home.homelandingscreen.VerticalViewModel r1 = r6.f23981d
            boolean r4 = r6.f23982e
            androidx.lifecycle.b0 r5 = com.forsale.app.features.categories.home.homelandingscreen.VerticalViewModel.L0(r1)
            r5.postValue(r7)
            com.forsale.app.features.categories.home.homelandingscreen.VerticalViewModel.d1(r1, r7)
            r6.f23978a = r1
            r6.f23979b = r3
            java.lang.Object r7 = com.forsale.app.features.categories.home.homelandingscreen.VerticalViewModel.X0(r1, r7, r4, r6)
            if (r7 != r0) goto L4a
            return r0
        L4a:
            kotlinx.coroutines.flow.MutableSharedFlow r7 = com.forsale.app.features.categories.home.homelandingscreen.VerticalViewModel.S0(r1)
            wz.p r1 = wz.p.f75480a
            r3 = 0
            r6.f23978a = r3
            r6.f23979b = r2
            java.lang.Object r7 = r7.emit(r1, r6)
            if (r7 != r0) goto L5c
            return r0
        L5c:
            wz.p r7 = wz.p.f75480a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.home.homelandingscreen.VerticalViewModel$fetchHomeScreenData$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((VerticalViewModel$fetchHomeScreenData$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
