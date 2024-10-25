package com.forsale.app.features.categories.listingdetails.buyerscreen.views;

import android.content.Context;
import androidx.fragment.app.FragmentManager;
import cb.b;
import com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsScreenViewModel;
import com.forsale.app.features.categories.listingdetails.buyerscreen.m;
import com.forsale.app.features.categories.listingdetails.models.DetailsModel;
import com.forsale.app.ui.bottomsheets.listingdetailschat.ChatNowBottomSheet;
import com.forsale.app.ui.bottomsheets.listingdetailsmoreactions.UserContactMode;
import com.forsale.app.utils.ContextExtensionsKt;
import g00.l;
import g00.p;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BuyerScaffold.kt */
@d(c = "com.forsale.app.features.categories.listingdetails.buyerscreen.views.BuyerScaffoldKt$registerContactEvents$1", f = "BuyerScaffold.kt", l = {383}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class BuyerScaffoldKt$registerContactEvents$1 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f26667a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ BuyerListingDetailsScreenViewModel f26668b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ Context f26669c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ FragmentManager f26670d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BuyerScaffold.kt */
    @d(c = "com.forsale.app.features.categories.listingdetails.buyerscreen.views.BuyerScaffoldKt$registerContactEvents$1$1", f = "BuyerScaffold.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.categories.listingdetails.buyerscreen.views.BuyerScaffoldKt$registerContactEvents$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements p<b, a<? super wz.p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f26671a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f26672b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Context f26673c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ BuyerListingDetailsScreenViewModel f26674d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ FragmentManager f26675e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Context context, BuyerListingDetailsScreenViewModel buyerListingDetailsScreenViewModel, FragmentManager fragmentManager, a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f26673c = context;
            this.f26674d = buyerListingDetailsScreenViewModel;
            this.f26675e = fragmentManager;
        }

        @Override // g00.p
        /* renamed from: b */
        public final Object invoke(b bVar, a<? super wz.p> aVar) {
            return ((AnonymousClass1) create(bVar, aVar)).invokeSuspend(wz.p.f75480a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final a<wz.p> create(Object obj, a<?> aVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f26673c, this.f26674d, this.f26675e, aVar);
            anonymousClass1.f26672b = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String str;
            kotlin.coroutines.intrinsics.b.f();
            if (this.f26671a == 0) {
                f.b(obj);
                b bVar = (b) this.f26672b;
                x10.a.b("CTAsBottomSheet:: contactAction:: " + bVar + " ", new Object[0]);
                if (bVar instanceof b.a) {
                    Context context = this.f26673c;
                    if (context != null) {
                        ContextExtensionsKt.z(context, ((b.a) bVar).b());
                    }
                } else if (bVar instanceof b.C0194b) {
                    DetailsModel a11 = ((b.C0194b) bVar).a();
                    this.f26674d.X0(UserContactMode.CALL_ONLY, a11);
                } else if (bVar instanceof b.f) {
                    Context context2 = this.f26673c;
                    if (context2 != null) {
                        b.f fVar = (b.f) bVar;
                        String b11 = fVar.b();
                        Context context3 = this.f26673c;
                        if (context3 != null) {
                            str = m.a(context3, fVar.c());
                        } else {
                            str = null;
                        }
                        ContextExtensionsKt.L(context2, b11, str, new l<Throwable, wz.p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.views.BuyerScaffoldKt.registerContactEvents.1.1.1
                            /* renamed from: invoke  reason: avoid collision after fix types in other method */
                            public final void invoke2(Throwable it2) {
                                o.i(it2, "it");
                            }

                            @Override // g00.l
                            public /* bridge */ /* synthetic */ wz.p invoke(Throwable th2) {
                                invoke2(th2);
                                return wz.p.f75480a;
                            }
                        });
                    }
                } else if (bVar instanceof b.g) {
                    DetailsModel a12 = ((b.g) bVar).a();
                    this.f26674d.X0(UserContactMode.WHATSAPP_ONLY, a12);
                } else if (bVar instanceof b.c) {
                    Context context4 = this.f26673c;
                    if (context4 != null) {
                        BuyerScaffoldKt.t(context4, ((b.c) bVar).a(), null, null, 6, null);
                    }
                } else if (bVar instanceof b.d) {
                    ChatNowBottomSheet.a.b(ChatNowBottomSheet.B, this.f26675e, ((b.d) bVar).a(), null, 4, null);
                }
                return wz.p.f75480a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuyerScaffoldKt$registerContactEvents$1(BuyerListingDetailsScreenViewModel buyerListingDetailsScreenViewModel, Context context, FragmentManager fragmentManager, a<? super BuyerScaffoldKt$registerContactEvents$1> aVar) {
        super(2, aVar);
        this.f26668b = buyerListingDetailsScreenViewModel;
        this.f26669c = context;
        this.f26670d = fragmentManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        return new BuyerScaffoldKt$registerContactEvents$1(this.f26668b, this.f26669c, this.f26670d, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f26667a;
        try {
            if (i11 != 0) {
                if (i11 == 1) {
                    f.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                f.b(obj);
                SharedFlow<b> m02 = this.f26668b.m0();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f26669c, this.f26668b, this.f26670d, null);
                this.f26667a = 1;
                if (FlowKt.collectLatest(m02, anonymousClass1, this) == f11) {
                    return f11;
                }
            }
        } catch (CancellationException unused) {
            x10.a.b("CTAsBottomSheet:: contactAction:: is Canceled  ", new Object[0]);
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, a<? super wz.p> aVar) {
        return ((BuyerScaffoldKt$registerContactEvents$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
