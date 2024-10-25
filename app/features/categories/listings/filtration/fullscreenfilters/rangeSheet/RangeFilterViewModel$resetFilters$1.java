package com.forsale.app.features.categories.listings.filtration.fullscreenfilters.rangeSheet;

import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RangeFilterViewModel.kt */
@d(c = "com.forsale.app.features.categories.listings.filtration.fullscreenfilters.rangeSheet.RangeFilterViewModel$resetFilters$1", f = "RangeFilterViewModel.kt", l = {60, 61, 62}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class RangeFilterViewModel$resetFilters$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f29941a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ RangeFilterViewModel f29942b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RangeFilterViewModel$resetFilters$1(RangeFilterViewModel rangeFilterViewModel, zz.a<? super RangeFilterViewModel$resetFilters$1> aVar) {
        super(2, aVar);
        this.f29942b = rangeFilterViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new RangeFilterViewModel$resetFilters$1(this.f29942b, aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0057 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.f()
            int r1 = r6.f29941a
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L26
            if (r1 == r5) goto L22
            if (r1 == r4) goto L1e
            if (r1 != r3) goto L16
            kotlin.f.b(r7)
            goto L58
        L16:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1e:
            kotlin.f.b(r7)
            goto L47
        L22:
            kotlin.f.b(r7)
            goto L38
        L26:
            kotlin.f.b(r7)
            com.forsale.app.features.categories.listings.filtration.fullscreenfilters.rangeSheet.RangeFilterViewModel r7 = r6.f29942b
            kotlinx.coroutines.flow.MutableStateFlow r7 = r7.B0()
            r6.f29941a = r5
            java.lang.Object r7 = r7.emit(r2, r6)
            if (r7 != r0) goto L38
            return r0
        L38:
            com.forsale.app.features.categories.listings.filtration.fullscreenfilters.rangeSheet.RangeFilterViewModel r7 = r6.f29942b
            kotlinx.coroutines.flow.MutableStateFlow r7 = r7.z0()
            r6.f29941a = r4
            java.lang.Object r7 = r7.emit(r2, r6)
            if (r7 != r0) goto L47
            return r0
        L47:
            com.forsale.app.features.categories.listings.filtration.fullscreenfilters.rangeSheet.RangeFilterViewModel r7 = r6.f29942b
            kotlinx.coroutines.flow.MutableSharedFlow r7 = r7.x0()
            com.forsale.app.features.categories.listings.filtration.fullscreenfilters.rangeSheet.RangeFilterViewModel$a$b r1 = com.forsale.app.features.categories.listings.filtration.fullscreenfilters.rangeSheet.RangeFilterViewModel.a.b.f29935a
            r6.f29941a = r3
            java.lang.Object r7 = r7.emit(r1, r6)
            if (r7 != r0) goto L58
            return r0
        L58:
            wz.p r7 = wz.p.f75480a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listings.filtration.fullscreenfilters.rangeSheet.RangeFilterViewModel$resetFilters$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((RangeFilterViewModel$resetFilters$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
