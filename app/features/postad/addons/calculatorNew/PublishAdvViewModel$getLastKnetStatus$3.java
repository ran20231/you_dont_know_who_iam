package com.forsale.app.features.postad.addons.calculatorNew;

import com.forsale.app.datalayer.network.entities.KnetPaymentStatus;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PublishAdvViewModel.kt */
@d(c = "com.forsale.app.features.postad.addons.calculatorNew.PublishAdvViewModel$getLastKnetStatus$3", f = "PublishAdvViewModel.kt", l = {148, 149}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class PublishAdvViewModel$getLastKnetStatus$3 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    Object f34631a;

    /* renamed from: b  reason: collision with root package name */
    Object f34632b;

    /* renamed from: c  reason: collision with root package name */
    Object f34633c;

    /* renamed from: d  reason: collision with root package name */
    double f34634d;

    /* renamed from: e  reason: collision with root package name */
    int f34635e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ PublishAdvViewModel f34636f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ double f34637g;

    /* compiled from: PublishAdvViewModel.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f34638a;

        static {
            int[] iArr = new int[KnetPaymentStatus.values().length];
            try {
                iArr[KnetPaymentStatus.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[KnetPaymentStatus.INCOMPLETE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[KnetPaymentStatus.FAIL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f34638a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PublishAdvViewModel$getLastKnetStatus$3(PublishAdvViewModel publishAdvViewModel, double d11, zz.a<? super PublishAdvViewModel$getLastKnetStatus$3> aVar) {
        super(2, aVar);
        this.f34636f = publishAdvViewModel;
        this.f34637g = d11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new PublishAdvViewModel$getLastKnetStatus$3(this.f34636f, this.f34637g, aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a1  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.f()
            int r1 = r10.f34635e
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L2c
            if (r1 == r3) goto L28
            if (r1 != r2) goto L20
            double r0 = r10.f34634d
            java.lang.Object r4 = r10.f34633c
            com.forsale.app.datalayer.network.entities.KnetPaymentStatus r4 = (com.forsale.app.datalayer.network.entities.KnetPaymentStatus) r4
            java.lang.Object r5 = r10.f34632b
            com.forsale.app.features.postad.addons.calculatorNew.PublishAdvViewModel r5 = (com.forsale.app.features.postad.addons.calculatorNew.PublishAdvViewModel) r5
            java.lang.Object r6 = r10.f34631a
            com.forsale.app.datalayer.network.entities.KnetPaymentStatus r6 = (com.forsale.app.datalayer.network.entities.KnetPaymentStatus) r6
            kotlin.f.b(r11)
            goto L77
        L20:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L28:
            kotlin.f.b(r11)
            goto L4f
        L2c:
            kotlin.f.b(r11)
            com.forsale.app.features.postad.addons.calculatorNew.PublishAdvViewModel r11 = r10.f34636f
            com.forsale.app.features.postad.i r11 = com.forsale.app.features.postad.addons.calculatorNew.PublishAdvViewModel.k(r11)
            of.b r11 = r11.a()
            com.forsale.app.features.postad.addons.calculatorNew.PublishAdvViewModel r1 = r10.f34636f
            com.forsale.app.features.postad.PostAdViewModel r1 = com.forsale.app.features.postad.addons.calculatorNew.PublishAdvViewModel.j(r1)
            com.forsale.app.datalayer.network.entities.ListingDetailsEntity r1 = r1.n2()
            kotlin.jvm.internal.o.f(r1)
            r10.f34635e = r3
            java.lang.Object r11 = r11.a(r1, r10)
            if (r11 != r0) goto L4f
            return r0
        L4f:
            com.forsale.app.datalayer.network.responses.LastKnetStatusResponse r11 = (com.forsale.app.datalayer.network.responses.LastKnetStatusResponse) r11
            com.forsale.app.datalayer.network.entities.KnetPaymentStatus r4 = r11.getStatus()
            com.forsale.app.features.postad.addons.calculatorNew.PublishAdvViewModel r5 = r10.f34636f
            double r6 = r10.f34637g
            kotlinx.coroutines.flow.MutableSharedFlow r11 = com.forsale.app.features.postad.addons.calculatorNew.PublishAdvViewModel.o(r5)
            kotlin.Pair r1 = new kotlin.Pair
            com.forsale.app.base.ViewStates r8 = com.forsale.app.base.ViewStates.CONTENT
            r9 = 0
            r1.<init>(r8, r9)
            r10.f34631a = r4
            r10.f34632b = r5
            r10.f34633c = r4
            r10.f34634d = r6
            r10.f34635e = r2
            java.lang.Object r11 = r11.emit(r1, r10)
            if (r11 != r0) goto L76
            return r0
        L76:
            r0 = r6
        L77:
            int[] r11 = com.forsale.app.features.postad.addons.calculatorNew.PublishAdvViewModel$getLastKnetStatus$3.a.f34638a
            int r4 = r4.ordinal()
            r11 = r11[r4]
            if (r11 == r3) goto La1
            if (r11 == r2) goto L94
            r0 = 3
            if (r11 == r0) goto L87
            goto Lb3
        L87:
            com.forsale.app.utils.analytics.g r11 = com.forsale.app.features.postad.addons.calculatorNew.PublishAdvViewModel.e(r5)
            com.forsale.app.utils.analytics.KnetPaymentType r0 = com.forsale.app.utils.analytics.KnetPaymentType.LISTING
            r11.e(r0)
            com.forsale.app.features.postad.addons.calculatorNew.PublishAdvViewModel.F(r5)
            goto Lb3
        L94:
            com.forsale.app.utils.analytics.g r11 = com.forsale.app.features.postad.addons.calculatorNew.PublishAdvViewModel.e(r5)
            com.forsale.app.utils.analytics.KnetPaymentType r0 = com.forsale.app.utils.analytics.KnetPaymentType.LISTING
            r11.f(r0)
            com.forsale.app.features.postad.addons.calculatorNew.PublishAdvViewModel.F(r5)
            goto Lb3
        La1:
            com.forsale.app.utils.analytics.g r11 = com.forsale.app.features.postad.addons.calculatorNew.PublishAdvViewModel.e(r5)
            com.forsale.app.utils.analytics.KnetPaymentType r2 = com.forsale.app.utils.analytics.KnetPaymentType.LISTING
            r11.d(r0, r2)
            com.forsale.app.features.postad.addons.calculatorNew.PublishAdvViewModel.D(r5)
            com.forsale.app.features.postad.addons.calculatorNew.PublishAdvViewModel.u(r5)
            com.forsale.app.features.postad.addons.calculatorNew.PublishAdvViewModel.y(r5)
        Lb3:
            wz.p r11 = wz.p.f75480a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.postad.addons.calculatorNew.PublishAdvViewModel$getLastKnetStatus$3.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((PublishAdvViewModel$getLastKnetStatus$3) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
