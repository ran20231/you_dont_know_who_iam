package com.forsale.app.features.postad;

import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PostAdViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.postad.PostAdViewModel$addNumberToAlternate$1", f = "PostAdViewModel.kt", l = {761, 769, 772}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class PostAdViewModel$addNumberToAlternate$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f33992a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ PostAdViewModel f33993b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ String f33994c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostAdViewModel$addNumberToAlternate$1(PostAdViewModel postAdViewModel, String str, zz.a<? super PostAdViewModel$addNumberToAlternate$1> aVar) {
        super(2, aVar);
        this.f33993b = postAdViewModel;
        this.f33994c = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new PostAdViewModel$addNumberToAlternate$1(this.f33993b, this.f33994c, aVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0051, code lost:
        r1 = kotlin.text.StringsKt__StringsKt.E0(r5, new char[]{','}, false, 0, 6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0062, code lost:
        r1 = kotlin.collections.CollectionsKt___CollectionsKt.b1(r1);
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008a A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.f()
            int r1 = r11.f33992a
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L26
            if (r1 == r4) goto L22
            if (r1 == r3) goto L1e
            if (r1 != r2) goto L16
            kotlin.f.b(r12)
            goto L8b
        L16:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L1e:
            kotlin.f.b(r12)
            goto L78
        L22:
            kotlin.f.b(r12)
            goto L36
        L26:
            kotlin.f.b(r12)
            com.forsale.app.features.postad.PostAdViewModel r12 = r11.f33993b
            java.lang.String r1 = r11.f33994c
            r11.f33992a = r4
            java.lang.Object r12 = com.forsale.app.features.postad.PostAdViewModel.u1(r12, r1, r11)
            if (r12 != r0) goto L36
            return r0
        L36:
            r5 = r12
            java.lang.String r5 = (java.lang.String) r5
            com.forsale.app.features.postad.PostAdViewModel r12 = r11.f33993b
            com.forsale.app.datalayer.network.entities.ListingDetailsEntity r12 = r12.n2()
            if (r12 == 0) goto L49
            com.forsale.app.features.postad.PostAdViewModel r1 = r11.f33993b
            r12.setContactNo(r5)
            r1.L4(r12)
        L49:
            com.forsale.app.features.postad.PostAdViewModel r12 = r11.f33993b
            com.forsale.app.features.postad.PostAdRepository r12 = com.forsale.app.features.postad.PostAdViewModel.D0(r12)
            if (r5 == 0) goto L6a
            char[] r6 = new char[r4]
            r1 = 0
            r7 = 44
            r6[r1] = r7
            r7 = 0
            r8 = 0
            r9 = 6
            r10 = 0
            java.util.List r1 = kotlin.text.k.E0(r5, r6, r7, r8, r9, r10)
            if (r1 == 0) goto L6a
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Set r1 = kotlin.collections.p.b1(r1)
            if (r1 != 0) goto L6f
        L6a:
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
        L6f:
            r11.f33992a = r3
            java.lang.Object r12 = r12.g(r1, r11)
            if (r12 != r0) goto L78
            return r0
        L78:
            com.forsale.app.features.postad.PostAdViewModel r12 = r11.f33993b
            kotlinx.coroutines.flow.MutableSharedFlow r12 = r12.d3()
            java.lang.Boolean r1 = kotlin.coroutines.jvm.internal.a.a(r4)
            r11.f33992a = r2
            java.lang.Object r12 = r12.emit(r1, r11)
            if (r12 != r0) goto L8b
            return r0
        L8b:
            wz.p r12 = wz.p.f75480a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.postad.PostAdViewModel$addNumberToAlternate$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((PostAdViewModel$addNumberToAlternate$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
