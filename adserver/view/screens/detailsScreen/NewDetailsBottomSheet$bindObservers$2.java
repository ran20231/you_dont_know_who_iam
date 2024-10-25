package com.forsale.adserver.view.screens.detailsScreen;

import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.forsale.adserver.utils.extensions.ContextExtensionsKt;
import com.forsale.adserver.view.viewmodel.NewDetailsViewModel;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NewDetailsBottomSheet.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.adserver.view.screens.detailsScreen.NewDetailsBottomSheet$bindObservers$2", f = "NewDetailsBottomSheet.kt", l = {406}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class NewDetailsBottomSheet$bindObservers$2 extends SuspendLambda implements g00.p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f21287a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ NewDetailsBottomSheet f21288b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NewDetailsBottomSheet.kt */
    @kotlin.coroutines.jvm.internal.d(c = "com.forsale.adserver.view.screens.detailsScreen.NewDetailsBottomSheet$bindObservers$2$1", f = "NewDetailsBottomSheet.kt", l = {407}, m = "invokeSuspend")
    /* renamed from: com.forsale.adserver.view.screens.detailsScreen.NewDetailsBottomSheet$bindObservers$2$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements g00.p<CoroutineScope, zz.a<? super wz.p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f21289a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ NewDetailsBottomSheet f21290b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: NewDetailsBottomSheet.kt */
        @kotlin.coroutines.jvm.internal.d(c = "com.forsale.adserver.view.screens.detailsScreen.NewDetailsBottomSheet$bindObservers$2$1$1", f = "NewDetailsBottomSheet.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.forsale.adserver.view.screens.detailsScreen.NewDetailsBottomSheet$bindObservers$2$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C02351 extends SuspendLambda implements g00.p<String, zz.a<? super wz.p>, Object> {

            /* renamed from: a  reason: collision with root package name */
            int f21291a;

            /* renamed from: b  reason: collision with root package name */
            /* synthetic */ Object f21292b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ NewDetailsBottomSheet f21293c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C02351(NewDetailsBottomSheet newDetailsBottomSheet, zz.a<? super C02351> aVar) {
                super(2, aVar);
                this.f21293c = newDetailsBottomSheet;
            }

            @Override // g00.p
            /* renamed from: b */
            public final Object invoke(String str, zz.a<? super wz.p> aVar) {
                return ((C02351) create(str, aVar)).invokeSuspend(wz.p.f75480a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
                C02351 c02351 = new C02351(this.f21293c, aVar);
                c02351.f21292b = obj;
                return c02351;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Context context;
                kotlin.coroutines.intrinsics.b.f();
                if (this.f21291a == 0) {
                    kotlin.f.b(obj);
                    String str = (String) this.f21292b;
                    if (str != null && (context = this.f21293c.getContext()) != null) {
                        kotlin.jvm.internal.o.f(context);
                        ContextExtensionsKt.c(context, str, new g00.l<Exception, wz.p>() { // from class: com.forsale.adserver.view.screens.detailsScreen.NewDetailsBottomSheet$bindObservers$2$1$1$1$1
                            public final void b(Exception it2) {
                                kotlin.jvm.internal.o.i(it2, "it");
                            }

                            @Override // g00.l
                            public /* bridge */ /* synthetic */ wz.p invoke(Exception exc) {
                                b(exc);
                                return wz.p.f75480a;
                            }
                        });
                    }
                    return wz.p.f75480a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(NewDetailsBottomSheet newDetailsBottomSheet, zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f21290b = newDetailsBottomSheet;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
            return new AnonymousClass1(this.f21290b, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object f11;
            NewDetailsViewModel M;
            f11 = kotlin.coroutines.intrinsics.b.f();
            int i11 = this.f21289a;
            if (i11 != 0) {
                if (i11 == 1) {
                    kotlin.f.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                kotlin.f.b(obj);
                M = this.f21290b.M();
                SharedFlow<String> h02 = M.h0();
                C02351 c02351 = new C02351(this.f21290b, null);
                this.f21289a = 1;
                if (FlowKt.collectLatest(h02, c02351, this) == f11) {
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
    public NewDetailsBottomSheet$bindObservers$2(NewDetailsBottomSheet newDetailsBottomSheet, zz.a<? super NewDetailsBottomSheet$bindObservers$2> aVar) {
        super(2, aVar);
        this.f21288b = newDetailsBottomSheet;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new NewDetailsBottomSheet$bindObservers$2(this.f21288b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f21287a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            NewDetailsBottomSheet newDetailsBottomSheet = this.f21288b;
            Lifecycle.State state = Lifecycle.State.STARTED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(newDetailsBottomSheet, null);
            this.f21287a = 1;
            if (RepeatOnLifecycleKt.b(newDetailsBottomSheet, state, anonymousClass1, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((NewDetailsBottomSheet$bindObservers$2) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
