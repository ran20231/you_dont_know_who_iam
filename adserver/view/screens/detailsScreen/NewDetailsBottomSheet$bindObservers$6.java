package com.forsale.adserver.view.screens.detailsScreen;

import android.os.Build;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.forsale.adserver.view.models.AdsModel;
import com.forsale.adserver.view.viewmodel.NewDetailsViewModel;
import com.forsale.core.netowrk.downloadmanger.DownloadStatus;
import com.forsale.core.netowrk.downloadmanger.MediaType;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NewDetailsBottomSheet.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.adserver.view.screens.detailsScreen.NewDetailsBottomSheet$bindObservers$6", f = "NewDetailsBottomSheet.kt", l = {451}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class NewDetailsBottomSheet$bindObservers$6 extends SuspendLambda implements g00.p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f21318a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ NewDetailsBottomSheet f21319b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NewDetailsBottomSheet.kt */
    @kotlin.coroutines.jvm.internal.d(c = "com.forsale.adserver.view.screens.detailsScreen.NewDetailsBottomSheet$bindObservers$6$1", f = "NewDetailsBottomSheet.kt", l = {452}, m = "invokeSuspend")
    /* renamed from: com.forsale.adserver.view.screens.detailsScreen.NewDetailsBottomSheet$bindObservers$6$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements g00.p<CoroutineScope, zz.a<? super wz.p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f21320a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ NewDetailsBottomSheet f21321b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: NewDetailsBottomSheet.kt */
        @kotlin.coroutines.jvm.internal.d(c = "com.forsale.adserver.view.screens.detailsScreen.NewDetailsBottomSheet$bindObservers$6$1$1", f = "NewDetailsBottomSheet.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.forsale.adserver.view.screens.detailsScreen.NewDetailsBottomSheet$bindObservers$6$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C02391 extends SuspendLambda implements g00.p<String, zz.a<? super wz.p>, Object> {

            /* renamed from: a  reason: collision with root package name */
            int f21322a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ NewDetailsBottomSheet f21323b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C02391(NewDetailsBottomSheet newDetailsBottomSheet, zz.a<? super C02391> aVar) {
                super(2, aVar);
                this.f21323b = newDetailsBottomSheet;
            }

            @Override // g00.p
            /* renamed from: b */
            public final Object invoke(String str, zz.a<? super wz.p> aVar) {
                return ((C02391) create(str, aVar)).invokeSuspend(wz.p.f75480a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
                return new C02391(this.f21323b, aVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                NewDetailsViewModel M;
                String h11;
                androidx.activity.result.b bVar;
                kotlin.coroutines.intrinsics.b.f();
                if (this.f21322a == 0) {
                    kotlin.f.b(obj);
                    if (Build.VERSION.SDK_INT < 33) {
                        bVar = this.f21323b.B;
                        bVar.a("android.permission.WRITE_EXTERNAL_STORAGE");
                    } else {
                        M = this.f21323b.M();
                        AdsModel value = M.L().getValue();
                        if (value != null && (h11 = value.h()) != null) {
                            final NewDetailsBottomSheet newDetailsBottomSheet = this.f21323b;
                            newDetailsBottomSheet.K().d(h11, MediaType.IMAGE, new g00.l<Result<? extends DownloadStatus>, wz.p>() { // from class: com.forsale.adserver.view.screens.detailsScreen.NewDetailsBottomSheet$bindObservers$6$1$1$1$1
                                /* JADX INFO: Access modifiers changed from: package-private */
                                {
                                    super(1);
                                }

                                public final void b(Object obj2) {
                                    NewDetailsViewModel M2;
                                    M2 = NewDetailsBottomSheet.this.M();
                                    M2.x0(Result.h(obj2));
                                }

                                @Override // g00.l
                                public /* bridge */ /* synthetic */ wz.p invoke(Result<? extends DownloadStatus> result) {
                                    b(result.j());
                                    return wz.p.f75480a;
                                }
                            });
                        }
                    }
                    return wz.p.f75480a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(NewDetailsBottomSheet newDetailsBottomSheet, zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f21321b = newDetailsBottomSheet;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
            return new AnonymousClass1(this.f21321b, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object f11;
            NewDetailsViewModel M;
            f11 = kotlin.coroutines.intrinsics.b.f();
            int i11 = this.f21320a;
            if (i11 != 0) {
                if (i11 == 1) {
                    kotlin.f.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                kotlin.f.b(obj);
                M = this.f21321b.M();
                SharedFlow<String> X = M.X();
                C02391 c02391 = new C02391(this.f21321b, null);
                this.f21320a = 1;
                if (FlowKt.collectLatest(X, c02391, this) == f11) {
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
    public NewDetailsBottomSheet$bindObservers$6(NewDetailsBottomSheet newDetailsBottomSheet, zz.a<? super NewDetailsBottomSheet$bindObservers$6> aVar) {
        super(2, aVar);
        this.f21319b = newDetailsBottomSheet;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new NewDetailsBottomSheet$bindObservers$6(this.f21319b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f21318a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            NewDetailsBottomSheet newDetailsBottomSheet = this.f21319b;
            Lifecycle.State state = Lifecycle.State.STARTED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(newDetailsBottomSheet, null);
            this.f21318a = 1;
            if (RepeatOnLifecycleKt.b(newDetailsBottomSheet, state, anonymousClass1, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((NewDetailsBottomSheet$bindObservers$6) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
