package com.forsale.adserver.view.screens.detailsScreen;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.forsale.adserver.view.viewmodel.NewDetailsViewModel;
import com.forsale.app.datalayer.network.errorhandling.ErrorCodes;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NewDetailsBottomSheet.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.adserver.view.screens.detailsScreen.NewDetailsBottomSheet$bindObservers$4", f = "NewDetailsBottomSheet.kt", l = {ErrorCodes.VALIDATION_ERROR_CODE}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class NewDetailsBottomSheet$bindObservers$4 extends SuspendLambda implements g00.p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f21302a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ NewDetailsBottomSheet f21303b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NewDetailsBottomSheet.kt */
    @kotlin.coroutines.jvm.internal.d(c = "com.forsale.adserver.view.screens.detailsScreen.NewDetailsBottomSheet$bindObservers$4$1", f = "NewDetailsBottomSheet.kt", l = {423}, m = "invokeSuspend")
    /* renamed from: com.forsale.adserver.view.screens.detailsScreen.NewDetailsBottomSheet$bindObservers$4$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements g00.p<CoroutineScope, zz.a<? super wz.p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f21304a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ NewDetailsBottomSheet f21305b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: NewDetailsBottomSheet.kt */
        @kotlin.coroutines.jvm.internal.d(c = "com.forsale.adserver.view.screens.detailsScreen.NewDetailsBottomSheet$bindObservers$4$1$1", f = "NewDetailsBottomSheet.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.forsale.adserver.view.screens.detailsScreen.NewDetailsBottomSheet$bindObservers$4$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C02371 extends SuspendLambda implements g00.p<wz.p, zz.a<? super wz.p>, Object> {

            /* renamed from: a  reason: collision with root package name */
            int f21306a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ NewDetailsBottomSheet f21307b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C02371(NewDetailsBottomSheet newDetailsBottomSheet, zz.a<? super C02371> aVar) {
                super(2, aVar);
                this.f21307b = newDetailsBottomSheet;
            }

            @Override // g00.p
            /* renamed from: b */
            public final Object invoke(wz.p pVar, zz.a<? super wz.p> aVar) {
                return ((C02371) create(pVar, aVar)).invokeSuspend(wz.p.f75480a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
                return new C02371(this.f21307b, aVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                kotlin.coroutines.intrinsics.b.f();
                if (this.f21306a == 0) {
                    kotlin.f.b(obj);
                    this.f21307b.dismiss();
                    return wz.p.f75480a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(NewDetailsBottomSheet newDetailsBottomSheet, zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f21305b = newDetailsBottomSheet;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
            return new AnonymousClass1(this.f21305b, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object f11;
            NewDetailsViewModel M;
            f11 = kotlin.coroutines.intrinsics.b.f();
            int i11 = this.f21304a;
            if (i11 != 0) {
                if (i11 == 1) {
                    kotlin.f.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                kotlin.f.b(obj);
                M = this.f21305b.M();
                SharedFlow<wz.p> S = M.S();
                C02371 c02371 = new C02371(this.f21305b, null);
                this.f21304a = 1;
                if (FlowKt.collectLatest(S, c02371, this) == f11) {
                    return f11;
                }
            }
            return wz.p.f75480a;
        }

        @Override // g00.p
        public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
            return ((AnonymousClass1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewDetailsBottomSheet$bindObservers$4(NewDetailsBottomSheet newDetailsBottomSheet, zz.a<? super NewDetailsBottomSheet$bindObservers$4> aVar) {
        super(2, aVar);
        this.f21303b = newDetailsBottomSheet;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new NewDetailsBottomSheet$bindObservers$4(this.f21303b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f21302a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            NewDetailsBottomSheet newDetailsBottomSheet = this.f21303b;
            Lifecycle.State state = Lifecycle.State.STARTED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(newDetailsBottomSheet, null);
            this.f21302a = 1;
            if (RepeatOnLifecycleKt.b(newDetailsBottomSheet, state, anonymousClass1, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((NewDetailsBottomSheet$bindObservers$4) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
