package com.forsale.app.features.postad.extraattributes.attributeview;

import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AttributeDropDownVerticalViewModel.kt */
@d(c = "com.forsale.app.features.postad.extraattributes.attributeview.AttributeDropDownVerticalViewModel$getOption$1", f = "AttributeDropDownVerticalViewModel.kt", l = {38, 39}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class AttributeDropDownVerticalViewModel$getOption$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f35299a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f35300b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ AttributeDropDownVerticalViewModel f35301c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ int f35302d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AttributeDropDownVerticalViewModel$getOption$1(AttributeDropDownVerticalViewModel attributeDropDownVerticalViewModel, int i11, zz.a<? super AttributeDropDownVerticalViewModel$getOption$1> aVar) {
        super(2, aVar);
        this.f35301c = attributeDropDownVerticalViewModel;
        this.f35302d = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        AttributeDropDownVerticalViewModel$getOption$1 attributeDropDownVerticalViewModel$getOption$1 = new AttributeDropDownVerticalViewModel$getOption$1(this.f35301c, this.f35302d, aVar);
        attributeDropDownVerticalViewModel$getOption$1.f35300b = obj;
        return attributeDropDownVerticalViewModel$getOption$1;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.f()
            int r1 = r5.f35299a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L26
            if (r1 == r3) goto L1e
            if (r1 != r2) goto L16
            java.lang.Object r0 = r5.f35300b
            kotlinx.coroutines.CoroutineScope r0 = (kotlinx.coroutines.CoroutineScope) r0
            kotlin.f.b(r6)
            goto L56
        L16:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1e:
            java.lang.Object r1 = r5.f35300b
            kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
            kotlin.f.b(r6)
            goto L41
        L26:
            kotlin.f.b(r6)
            java.lang.Object r6 = r5.f35300b
            r1 = r6
            kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
            com.forsale.app.features.postad.extraattributes.attributeview.AttributeDropDownVerticalViewModel r6 = r5.f35301c
            com.forsale.app.datalayer.repositories.ExtraAttributeOptionDao r6 = com.forsale.app.features.postad.extraattributes.attributeview.AttributeDropDownVerticalViewModel.a(r6)
            int r4 = r5.f35302d
            r5.f35300b = r1
            r5.f35299a = r3
            java.lang.Object r6 = r6.getExtraAttributeOptionById(r4, r5)
            if (r6 != r0) goto L41
            return r0
        L41:
            com.forsale.app.datalayer.database.ExtraAttributeOptionEntity r6 = (com.forsale.app.datalayer.database.ExtraAttributeOptionEntity) r6
            if (r6 == 0) goto L59
            com.forsale.app.features.postad.extraattributes.attributeview.AttributeDropDownVerticalViewModel r3 = r5.f35301c
            kotlinx.coroutines.flow.MutableSharedFlow r3 = com.forsale.app.features.postad.extraattributes.attributeview.AttributeDropDownVerticalViewModel.b(r3)
            r5.f35300b = r1
            r5.f35299a = r2
            java.lang.Object r6 = r3.emit(r6, r5)
            if (r6 != r0) goto L56
            return r0
        L56:
            wz.p r6 = wz.p.f75480a
            goto L5a
        L59:
            r6 = 0
        L5a:
            if (r6 != 0) goto L66
            com.forsale.app.features.postad.extraattributes.attributeview.AttributeDropDownVerticalViewModel r6 = r5.f35301c
            com.forsale.app.datalayer.database.ExtraAttributeFlatGroupEntity r6 = r6.d()
            r0 = -1
            r6.setOptionId(r0)
        L66:
            wz.p r6 = wz.p.f75480a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.postad.extraattributes.attributeview.AttributeDropDownVerticalViewModel$getOption$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((AttributeDropDownVerticalViewModel$getOption$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
