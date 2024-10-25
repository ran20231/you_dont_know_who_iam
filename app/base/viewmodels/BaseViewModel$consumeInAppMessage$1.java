package com.forsale.app.base.viewmodels;

import g00.p;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BaseViewModel.kt */
@d(c = "com.forsale.app.base.viewmodels.BaseViewModel$consumeInAppMessage$1", f = "BaseViewModel.kt", l = {132, 134, 157}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class BaseViewModel$consumeInAppMessage$1 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f22247a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ BaseViewModel f22248b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BaseViewModel.kt */
    @d(c = "com.forsale.app.base.viewmodels.BaseViewModel$consumeInAppMessage$1$2", f = "BaseViewModel.kt", l = {159}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.base.viewmodels.BaseViewModel$consumeInAppMessage$1$2  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass2 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f22257a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ BaseViewModel f22258b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(BaseViewModel baseViewModel, a<? super AnonymousClass2> aVar) {
            super(2, aVar);
            this.f22258b = baseViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final a<wz.p> create(Object obj, a<?> aVar) {
            return new AnonymousClass2(this.f22258b, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object f11;
            MutableSharedFlow mutableSharedFlow;
            f11 = b.f();
            int i11 = this.f22257a;
            if (i11 != 0) {
                if (i11 == 1) {
                    f.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                f.b(obj);
                mutableSharedFlow = this.f22258b.f22225c0;
                wz.p pVar = wz.p.f75480a;
                this.f22257a = 1;
                if (mutableSharedFlow.emit(pVar, this) == f11) {
                    return f11;
                }
            }
            return wz.p.f75480a;
        }

        @Override // g00.p
        public final Object invoke(CoroutineScope coroutineScope, a<? super wz.p> aVar) {
            return ((AnonymousClass2) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BaseViewModel.kt */
    @d(c = "com.forsale.app.base.viewmodels.BaseViewModel$consumeInAppMessage$1$3", f = "BaseViewModel.kt", l = {161}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.base.viewmodels.BaseViewModel$consumeInAppMessage$1$3  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass3 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f22259a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ BaseViewModel f22260b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(BaseViewModel baseViewModel, a<? super AnonymousClass3> aVar) {
            super(2, aVar);
            this.f22260b = baseViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final a<wz.p> create(Object obj, a<?> aVar) {
            return new AnonymousClass3(this.f22260b, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object f11;
            MutableSharedFlow mutableSharedFlow;
            f11 = b.f();
            int i11 = this.f22259a;
            if (i11 != 0) {
                if (i11 == 1) {
                    f.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                f.b(obj);
                mutableSharedFlow = this.f22260b.f22225c0;
                wz.p pVar = wz.p.f75480a;
                this.f22259a = 1;
                if (mutableSharedFlow.emit(pVar, this) == f11) {
                    return f11;
                }
            }
            return wz.p.f75480a;
        }

        @Override // g00.p
        public final Object invoke(CoroutineScope coroutineScope, a<? super wz.p> aVar) {
            return ((AnonymousClass3) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseViewModel$consumeInAppMessage$1(BaseViewModel baseViewModel, a<? super BaseViewModel$consumeInAppMessage$1> aVar) {
        super(2, aVar);
        this.f22248b = baseViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        return new BaseViewModel$consumeInAppMessage$1(this.f22248b, aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005f  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.f()
            int r1 = r13.f22247a
            r2 = 3
            r3 = 2
            r4 = 0
            r5 = 1
            if (r1 == 0) goto L27
            if (r1 == r5) goto L23
            if (r1 == r3) goto L1f
            if (r1 != r2) goto L17
            kotlin.f.b(r14)
            goto La9
        L17:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L1f:
            kotlin.f.b(r14)
            goto L5b
        L23:
            kotlin.f.b(r14)
            goto L39
        L27:
            kotlin.f.b(r14)
            com.forsale.app.base.viewmodels.BaseViewModel r14 = r13.f22248b
            com.forsale.app.datalayer.repositories.InAppRepository r14 = r14.A()
            r13.f22247a = r5
            java.lang.Object r14 = r14.getInAppMessageConsumed(r13)
            if (r14 != r0) goto L39
            return r0
        L39:
            java.lang.Number r14 = (java.lang.Number) r14
            int r14 = r14.intValue()
            boolean r14 = com.forsale.app.utils.TypeExtensionsKt.h0(r14)
            if (r14 != 0) goto Lbe
            com.forsale.app.base.viewmodels.BaseViewModel r14 = r13.f22248b
            com.forsale.app.datalayer.repositories.InAppRepository r6 = r14.A()
            com.forsale.app.datalayer.database.InAppType r7 = com.forsale.app.datalayer.database.InAppType.IN_APP
            r8 = 0
            r9 = 0
            r11 = 6
            r12 = 0
            r13.f22247a = r3
            r10 = r13
            java.lang.Object r14 = com.forsale.app.datalayer.repositories.InAppRepository.consumeInAppMessage$default(r6, r7, r8, r9, r10, r11, r12)
            if (r14 != r0) goto L5b
            return r0
        L5b:
            com.forsale.app.datalayer.database.InAppMessageEntity r14 = (com.forsale.app.datalayer.database.InAppMessageEntity) r14
            if (r14 == 0) goto La9
            com.forsale.app.base.viewmodels.BaseViewModel r1 = r13.f22248b
            java.lang.String r3 = r14.getImage()
            if (r3 == 0) goto L6f
            int r3 = r3.length()
            if (r3 != 0) goto L6e
            goto L6f
        L6e:
            r5 = 0
        L6f:
            if (r5 != 0) goto L82
            com.forsale.app.datalayer.repositories.ImagesRepository r3 = r1.y()
            java.lang.String r5 = r14.getImage()
            com.forsale.app.base.viewmodels.BaseViewModel$consumeInAppMessage$1$1$1 r6 = new com.forsale.app.base.viewmodels.BaseViewModel$consumeInAppMessage$1$1$1
            r6.<init>()
            r3.downloadImageBitmap(r5, r6)
            goto L98
        L82:
            com.forsale.app.base.viewmodels.BaseViewModel.k(r1)
            r1.p(r14)
            kotlinx.coroutines.CoroutineScope r7 = androidx.lifecycle.r0.a(r1)
            r8 = 0
            r9 = 0
            com.forsale.app.base.viewmodels.BaseViewModel$consumeInAppMessage$1$1$2 r10 = new com.forsale.app.base.viewmodels.BaseViewModel$consumeInAppMessage$1$1$2
            r10.<init>(r1, r14, r4)
            r11 = 3
            r12 = 0
            kotlinx.coroutines.BuildersKt.launch$default(r7, r8, r9, r10, r11, r12)
        L98:
            int r14 = r14.getDuration()
            long r5 = (long) r14
            r7 = 1000(0x3e8, double:4.94E-321)
            long r5 = r5 * r7
            r13.f22247a = r2
            java.lang.Object r14 = kotlinx.coroutines.DelayKt.delay(r5, r13)
            if (r14 != r0) goto La9
            return r0
        La9:
            com.forsale.app.base.viewmodels.BaseViewModel r14 = r13.f22248b
            kotlinx.coroutines.CoroutineScope r5 = androidx.lifecycle.r0.a(r14)
            r6 = 0
            r7 = 0
            com.forsale.app.base.viewmodels.BaseViewModel$consumeInAppMessage$1$2 r8 = new com.forsale.app.base.viewmodels.BaseViewModel$consumeInAppMessage$1$2
            com.forsale.app.base.viewmodels.BaseViewModel r14 = r13.f22248b
            r8.<init>(r14, r4)
            r9 = 3
            r10 = 0
            kotlinx.coroutines.BuildersKt.launch$default(r5, r6, r7, r8, r9, r10)
            goto Ld2
        Lbe:
            com.forsale.app.base.viewmodels.BaseViewModel r14 = r13.f22248b
            kotlinx.coroutines.CoroutineScope r5 = androidx.lifecycle.r0.a(r14)
            r6 = 0
            r7 = 0
            com.forsale.app.base.viewmodels.BaseViewModel$consumeInAppMessage$1$3 r8 = new com.forsale.app.base.viewmodels.BaseViewModel$consumeInAppMessage$1$3
            com.forsale.app.base.viewmodels.BaseViewModel r14 = r13.f22248b
            r8.<init>(r14, r4)
            r9 = 3
            r10 = 0
            kotlinx.coroutines.BuildersKt.launch$default(r5, r6, r7, r8, r9, r10)
        Ld2:
            wz.p r14 = wz.p.f75480a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.base.viewmodels.BaseViewModel$consumeInAppMessage$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, a<? super wz.p> aVar) {
        return ((BaseViewModel$consumeInAppMessage$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
