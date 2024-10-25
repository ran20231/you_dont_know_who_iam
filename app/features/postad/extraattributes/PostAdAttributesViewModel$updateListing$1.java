package com.forsale.app.features.postad.extraattributes;

import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PostAdAttributesViewModel.kt */
@d(c = "com.forsale.app.features.postad.extraattributes.PostAdAttributesViewModel$updateListing$1", f = "PostAdAttributesViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class PostAdAttributesViewModel$updateListing$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f35164a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ PostAdAttributesViewModel f35165b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostAdAttributesViewModel$updateListing$1(PostAdAttributesViewModel postAdAttributesViewModel, zz.a<? super PostAdAttributesViewModel$updateListing$1> aVar) {
        super(2, aVar);
        this.f35165b = postAdAttributesViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new PostAdAttributesViewModel$updateListing$1(this.f35165b, aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0051 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x002d A[SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            kotlin.coroutines.intrinsics.a.f()
            int r0 = r10.f35164a
            if (r0 != 0) goto L84
            kotlin.f.b(r11)
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            com.forsale.app.features.postad.extraattributes.PostAdAttributesViewModel r0 = r10.f35165b
            java.util.ArrayList r0 = r0.L0()
            java.util.Iterator r0 = r0.iterator()
        L19:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L69
            java.lang.Object r1 = r0.next()
            com.forsale.app.features.postad.extraattributes.attributesgroupitem.AttributesGroupItemViewModel r1 = (com.forsale.app.features.postad.extraattributes.attributesgroupitem.AttributesGroupItemViewModel) r1
            java.util.List r1 = r1.a()
            java.util.Iterator r1 = r1.iterator()
        L2d:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L19
            java.lang.Object r2 = r1.next()
            com.forsale.app.datalayer.database.ExtraAttributeFlatGroupEntity r2 = (com.forsale.app.datalayer.database.ExtraAttributeFlatGroupEntity) r2
            java.lang.String r3 = r2.getGetUserValue()
            if (r3 == 0) goto L2d
            java.lang.String r3 = r2.getGetUserValue()
            if (r3 == 0) goto L4e
            boolean r3 = kotlin.text.k.v(r3)
            if (r3 == 0) goto L4c
            goto L4e
        L4c:
            r3 = 0
            goto L4f
        L4e:
            r3 = 1
        L4f:
            if (r3 != 0) goto L2d
            com.forsale.app.datalayer.network.entities.ExtraAttr r3 = new com.forsale.app.datalayer.network.entities.ExtraAttr
            int r5 = r2.getId()
            java.lang.String r6 = r2.getGetUserValue()
            kotlin.jvm.internal.o.f(r6)
            r7 = 0
            r8 = 4
            r9 = 0
            r4 = r3
            r4.<init>(r5, r6, r7, r8, r9)
            r11.add(r3)
            goto L2d
        L69:
            com.forsale.app.features.postad.extraattributes.PostAdAttributesViewModel r0 = r10.f35165b
            com.forsale.app.features.postad.PostAdViewModel r0 = r0.O0()
            com.forsale.app.datalayer.network.entities.ListingDetailsEntity r0 = r0.n2()
            if (r0 == 0) goto L81
            com.forsale.app.features.postad.extraattributes.PostAdAttributesViewModel r1 = r10.f35165b
            r0.setExtraAttrs(r11)
            com.forsale.app.features.postad.PostAdViewModel r11 = r1.O0()
            r11.L4(r0)
        L81:
            wz.p r11 = wz.p.f75480a
            return r11
        L84:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.postad.extraattributes.PostAdAttributesViewModel$updateListing$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((PostAdAttributesViewModel$updateListing$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
