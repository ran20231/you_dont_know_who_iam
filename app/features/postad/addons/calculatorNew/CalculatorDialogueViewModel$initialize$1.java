package com.forsale.app.features.postad.addons.calculatorNew;

import com.forsale.app.models.CalculatorEntity;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CalculatorDialogueViewModel.kt */
@d(c = "com.forsale.app.features.postad.addons.calculatorNew.CalculatorDialogueViewModel$initialize$1", f = "CalculatorDialogueViewModel.kt", l = {70, 72, 80}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class CalculatorDialogueViewModel$initialize$1 extends SuspendLambda implements p<CalculatorEntity, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    Object f34566a;

    /* renamed from: b  reason: collision with root package name */
    Object f34567b;

    /* renamed from: c  reason: collision with root package name */
    boolean f34568c;

    /* renamed from: d  reason: collision with root package name */
    int f34569d;

    /* renamed from: e  reason: collision with root package name */
    /* synthetic */ Object f34570e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ CalculatorDialogueViewModel f34571f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CalculatorDialogueViewModel$initialize$1(CalculatorDialogueViewModel calculatorDialogueViewModel, zz.a<? super CalculatorDialogueViewModel$initialize$1> aVar) {
        super(2, aVar);
        this.f34571f = calculatorDialogueViewModel;
    }

    @Override // g00.p
    /* renamed from: b */
    public final Object invoke(CalculatorEntity calculatorEntity, zz.a<? super wz.p> aVar) {
        return ((CalculatorDialogueViewModel$initialize$1) create(calculatorEntity, aVar)).invokeSuspend(wz.p.f75480a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        CalculatorDialogueViewModel$initialize$1 calculatorDialogueViewModel$initialize$1 = new CalculatorDialogueViewModel$initialize$1(this.f34571f, aVar);
        calculatorDialogueViewModel$initialize$1.f34570e = obj;
        return calculatorDialogueViewModel$initialize$1;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00bc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00bd  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.f()
            int r1 = r9.f34569d
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L45
            if (r1 == r4) goto L36
            if (r1 == r3) goto L2a
            if (r1 != r2) goto L22
            java.lang.Object r0 = r9.f34567b
            qf.c r0 = (qf.c) r0
            java.lang.Object r1 = r9.f34566a
            qf.c r1 = (qf.c) r1
            java.lang.Object r1 = r9.f34570e
            com.forsale.app.features.postad.addons.calculatorNew.CalculatorDialogueViewModel r1 = (com.forsale.app.features.postad.addons.calculatorNew.CalculatorDialogueViewModel) r1
            kotlin.f.b(r10)
            goto Lbe
        L22:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L2a:
            java.lang.Object r1 = r9.f34566a
            com.forsale.app.models.CalculatorEntity r1 = (com.forsale.app.models.CalculatorEntity) r1
            java.lang.Object r3 = r9.f34570e
            com.forsale.app.features.postad.addons.calculatorNew.CalculatorDialogueViewModel r3 = (com.forsale.app.features.postad.addons.calculatorNew.CalculatorDialogueViewModel) r3
            kotlin.f.b(r10)
            goto L9f
        L36:
            boolean r1 = r9.f34568c
            java.lang.Object r4 = r9.f34566a
            com.forsale.app.models.CalculatorEntity r4 = (com.forsale.app.models.CalculatorEntity) r4
            java.lang.Object r5 = r9.f34570e
            com.forsale.app.features.postad.addons.calculatorNew.CalculatorDialogueViewModel r5 = (com.forsale.app.features.postad.addons.calculatorNew.CalculatorDialogueViewModel) r5
            kotlin.f.b(r10)
            r10 = r4
            goto L84
        L45:
            kotlin.f.b(r10)
            java.lang.Object r10 = r9.f34570e
            com.forsale.app.models.CalculatorEntity r10 = (com.forsale.app.models.CalculatorEntity) r10
            if (r10 == 0) goto Lc5
            com.forsale.app.features.postad.addons.calculatorNew.CalculatorDialogueViewModel r1 = r9.f34571f
            com.forsale.app.features.postad.PostAdViewModel r5 = com.forsale.app.features.postad.addons.calculatorNew.CalculatorDialogueViewModel.w0(r1)
            com.forsale.app.datalayer.network.entities.ListingDetailsEntity r5 = r5.n2()
            if (r5 == 0) goto La2
            of.f r6 = com.forsale.app.features.postad.addons.calculatorNew.CalculatorDialogueViewModel.x0(r1)
            com.forsale.app.features.postad.PostAdViewModel r7 = com.forsale.app.features.postad.addons.calculatorNew.CalculatorDialogueViewModel.w0(r1)
            com.forsale.app.datalayer.network.entities.PostListingIntention r7 = r7.k2()
            boolean r5 = r6.a(r5, r7)
            kotlinx.coroutines.flow.MutableStateFlow r6 = com.forsale.app.features.postad.addons.calculatorNew.CalculatorDialogueViewModel.B0(r1)
            java.lang.Boolean r7 = kotlin.coroutines.jvm.internal.a.a(r5)
            r9.f34570e = r1
            r9.f34566a = r10
            r9.f34568c = r5
            r9.f34569d = r4
            java.lang.Object r4 = r6.emit(r7, r9)
            if (r4 != r0) goto L81
            return r0
        L81:
            r8 = r5
            r5 = r1
            r1 = r8
        L84:
            if (r1 == 0) goto La1
            kotlinx.coroutines.flow.MutableStateFlow r1 = com.forsale.app.features.postad.addons.calculatorNew.CalculatorDialogueViewModel.y0(r5)
            qf.a$a r4 = qf.a.f66441d
            qf.a r4 = r4.a(r10)
            r9.f34570e = r5
            r9.f34566a = r10
            r9.f34569d = r3
            java.lang.Object r1 = r1.emit(r4, r9)
            if (r1 != r0) goto L9d
            return r0
        L9d:
            r1 = r10
            r3 = r5
        L9f:
            r10 = r1
            r5 = r3
        La1:
            r1 = r5
        La2:
            of.c r3 = com.forsale.app.features.postad.addons.calculatorNew.CalculatorDialogueViewModel.v0(r1)
            qf.c r10 = r3.a(r10)
            kotlinx.coroutines.flow.MutableStateFlow r3 = com.forsale.app.features.postad.addons.calculatorNew.CalculatorDialogueViewModel.A0(r1)
            r9.f34570e = r1
            r9.f34566a = r10
            r9.f34567b = r10
            r9.f34569d = r2
            java.lang.Object r2 = r3.emit(r10, r9)
            if (r2 != r0) goto Lbd
            return r0
        Lbd:
            r0 = r10
        Lbe:
            com.forsale.app.features.postad.PostAdViewModel r10 = com.forsale.app.features.postad.addons.calculatorNew.CalculatorDialogueViewModel.w0(r1)
            r10.N4(r0)
        Lc5:
            wz.p r10 = wz.p.f75480a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.postad.addons.calculatorNew.CalculatorDialogueViewModel$initialize$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
