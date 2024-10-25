package com.forsale.app.features.categories.home.homelandingscreen;

import android.content.Context;
import android.net.Uri;
import androidx.fragment.app.FragmentManager;
import com.forsale.adserver.view.models.AdsModel;
import com.forsale.adserver.view.models.CommercialModel;
import com.forsale.adserver.view.models.DetailsIntention;
import com.forsale.adserver.view.screens.detailsScreen.NewDetailsBottomSheetKt;
import com.forsale.analytics.commercial.CommercialItemDetailsSource;
import com.forsale.analytics.commercial.CommercialPageSource;
import com.forsale.app.features.categories.home.CategoriesNavGraphViewModel;
import com.forsale.app.notifications.fcm.FCMTopLevelFunctionsKt;
import com.forsale.app.utils.ContextExtensionsKt;
import g00.l;
import java.util.Arrays;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import t9.y0;
import wz.p;
/* compiled from: VerticalFragment.kt */
@d(c = "com.forsale.app.features.categories.home.homelandingscreen.VerticalFragment$onViewCreated$6", f = "VerticalFragment.kt", l = {121}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class VerticalFragment$onViewCreated$6 extends SuspendLambda implements l<zz.a<? super p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f23901a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ VerticalFragment f23902b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VerticalFragment.kt */
    @d(c = "com.forsale.app.features.categories.home.homelandingscreen.VerticalFragment$onViewCreated$6$1", f = "VerticalFragment.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.categories.home.homelandingscreen.VerticalFragment$onViewCreated$6$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements g00.p<AdsModel, zz.a<? super p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f23903a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f23904b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ VerticalFragment f23905c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(VerticalFragment verticalFragment, zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f23905c = verticalFragment;
        }

        @Override // g00.p
        /* renamed from: b */
        public final Object invoke(AdsModel adsModel, zz.a<? super p> aVar) {
            return ((AnonymousClass1) create(adsModel, aVar)).invokeSuspend(p.f75480a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<p> create(Object obj, zz.a<?> aVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f23905c, aVar);
            anonymousClass1.f23904b = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.f();
            if (this.f23903a == 0) {
                f.b(obj);
                AdsModel adsModel = (AdsModel) this.f23904b;
                Context context = this.f23905c.getContext();
                if (context != null) {
                    final VerticalFragment verticalFragment = this.f23905c;
                    final androidx.appcompat.app.d l11 = ContextExtensionsKt.l(context);
                    if (l11 != null) {
                        FragmentManager supportFragmentManager = l11.getSupportFragmentManager();
                        CommercialItemDetailsSource commercialItemDetailsSource = CommercialItemDetailsSource.DEEP_LINK;
                        DetailsIntention detailsIntention = DetailsIntention.DETAILS_ONLY;
                        l<CommercialPageSource, p> lVar = new l<CommercialPageSource, p>() { // from class: com.forsale.app.features.categories.home.homelandingscreen.VerticalFragment$onViewCreated$6$1$1$1$1
                            /* JADX INFO: Access modifiers changed from: package-private */
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            public final void b(CommercialPageSource commercialPageSource) {
                                androidx.appcompat.app.d dVar = androidx.appcompat.app.d.this;
                                w wVar = w.f61809a;
                                String string = verticalFragment.getString(y0.I2);
                                o.h(string, "getString(...)");
                                String format = String.format(string, Arrays.copyOf(new Object[]{new com.google.gson.d().t(new CommercialModel(commercialPageSource, null, null, 6, null))}, 1));
                                o.h(format, "format(...)");
                                FCMTopLevelFunctionsKt.b(dVar, Uri.parse(format).toString());
                            }

                            @Override // g00.l
                            public /* bridge */ /* synthetic */ p invoke(CommercialPageSource commercialPageSource) {
                                b(commercialPageSource);
                                return p.f75480a;
                            }
                        };
                        o.f(supportFragmentManager);
                        NewDetailsBottomSheetKt.f(context, adsModel, lVar, null, supportFragmentManager, detailsIntention, commercialItemDetailsSource, null, null, 196, null);
                    }
                }
                return p.f75480a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerticalFragment$onViewCreated$6(VerticalFragment verticalFragment, zz.a<? super VerticalFragment$onViewCreated$6> aVar) {
        super(1, aVar);
        this.f23902b = verticalFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<p> create(zz.a<?> aVar) {
        return new VerticalFragment$onViewCreated$6(this.f23902b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        CategoriesNavGraphViewModel k02;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f23901a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            k02 = this.f23902b.k0();
            SharedFlow<AdsModel> I0 = k02.I0();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f23902b, null);
            this.f23901a = 1;
            if (FlowKt.collectLatest(I0, anonymousClass1, this) == f11) {
                return f11;
            }
        }
        return p.f75480a;
    }

    @Override // g00.l
    public final Object invoke(zz.a<? super p> aVar) {
        return ((VerticalFragment$onViewCreated$6) create(aVar)).invokeSuspend(p.f75480a);
    }
}
