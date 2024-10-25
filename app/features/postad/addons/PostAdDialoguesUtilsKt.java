package com.forsale.app.features.postad.addons;

import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import com.forsale.app.datalayer.network.responses.Addon;
import com.forsale.app.features.categories.listingdetails.ListingDetailsActivity;
import com.forsale.app.features.categories.listings.ListingsTypes;
import com.forsale.app.features.more.WebActivity;
import com.forsale.app.features.more.WebType;
import com.forsale.app.features.more.support.SupportActivity;
import com.forsale.app.features.postad.PLFActivity;
import com.forsale.app.features.postad.PostAdDialogs;
import com.forsale.app.features.postad.PostAdUtilsKt;
import com.forsale.app.features.postad.PostAdViewModel;
import com.forsale.app.features.postad.media.MediaTypes;
import com.forsale.app.ui.bottomsheets.alertbottomsheet.AlertBottomSheet;
import com.forsale.app.ui.bottomsheets.alertbottomsheet.items.models.ActionModel;
import com.forsale.app.ui.bottomsheets.alertbottomsheet.items.models.AlertModel;
import com.forsale.app.ui.bottomsheets.alertbottomsheet.items.models.ImageModel;
import com.forsale.app.ui.bottomsheets.alertbottomsheet.items.models.TextModel;
import com.forsale.app.utils.ContextExtensionsKt;
import com.forsale.app.utils.analytics.AnalyticsDetailsSource;
import com.forsale.app.utils.analytics.PLFSource;
import com.forsale.app.utils.c;
import com.forsale.app.utils.itemutils.TextHolder;
import com.google.android.gms.ads.AdRequest;
import java.util.List;
import kotlin.collections.r;
import kotlin.jvm.internal.o;
import okhttp3.internal.http2.Http2;
import t9.q0;
import t9.y0;
import wz.p;
/* compiled from: PostAdDialoguesUtils.kt */
/* loaded from: classes2.dex */
public final class PostAdDialoguesUtilsKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(PostAdViewModel postAdViewModel, g00.a<p> aVar) {
        postAdViewModel.b4();
        aVar.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(PostAdViewModel postAdViewModel) {
        PostAdViewModel.q4(postAdViewModel, true, MediaTypes.VIDEO, false, false, 12, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(PostAdViewModel postAdViewModel) {
        postAdViewModel.F4(true);
    }

    public static final void g(Fragment fragment, PostAdViewModel postAdViewModel) {
        o.i(fragment, "<this>");
        o.i(postAdViewModel, "postAdViewModel");
        postAdViewModel.g4();
        Context context = fragment.getContext();
        if (context != null) {
            SupportActivity.f32788x.a(context);
        }
    }

    public static final void h(Fragment fragment, PLFSource source) {
        o.i(fragment, "<this>");
        o.i(source, "source");
        androidx.fragment.app.p activity = fragment.getActivity();
        if (activity != null) {
            activity.finish();
            Intent intent = new Intent(activity, PLFActivity.class);
            intent.putExtra("source_key", source);
            activity.startActivity(intent);
        }
    }

    public static final void i(Fragment fragment, int i11, AnalyticsDetailsSource source, PostAdViewModel postAdViewModel, boolean z11) {
        o.i(fragment, "<this>");
        o.i(source, "source");
        o.i(postAdViewModel, "postAdViewModel");
        if (!postAdViewModel.q3()) {
            androidx.fragment.app.p activity = fragment.getActivity();
            o.g(activity, "null cannot be cast to non-null type com.forsale.app.features.postad.PLFActivity");
            ((PLFActivity) activity).finish();
            Context context = fragment.getContext();
            if (context != null) {
                ListingDetailsActivity.R.a(context, (r33 & 1) != 0 ? null : null, (r33 & 2) != 0 ? null : null, (r33 & 4) != 0 ? -1 : i11, (r33 & 8) != 0 ? null : null, (r33 & 16) != 0 ? ListingsTypes.NORMAL_LISTINGS : null, (r33 & 32) != 0 ? null : source.getValue(), (r33 & 64) != 0 ? null : null, (r33 & 128) != 0 ? null : null, (r33 & 256) != 0 ? null : null, (r33 & AdRequest.MAX_CONTENT_URL_LENGTH) != 0 ? null : null, (r33 & 1024) != 0 ? false : false, (r33 & RecyclerView.l.FLAG_MOVED) == 0 ? 0 : -1, (r33 & RecyclerView.l.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? null : null, (r33 & 8192) == 0 ? null : null, (r33 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? r.n() : null);
                return;
            }
            return;
        }
        postAdViewModel.O1(z11);
    }

    public static final void j(Fragment fragment) {
        o.i(fragment, "<this>");
        androidx.fragment.app.p activity = fragment.getActivity();
        if (activity != null) {
            activity.finish();
            Context context = fragment.getContext();
            if (context != null) {
                o.f(context);
                ContextExtensionsKt.E(context);
            }
        }
    }

    public static final void k(Fragment fragment, String paymentUrl) {
        o.i(fragment, "<this>");
        o.i(paymentUrl, "paymentUrl");
        Context context = fragment.getContext();
        if (context != null) {
            WebActivity.a aVar = WebActivity.I;
            WebType webType = WebType.PAYMENT;
            String string = context.getString(y0.Sa);
            o.h(string, "getString(...)");
            Intent b11 = WebActivity.a.b(aVar, context, webType, string, paymentUrl, 1, null, 32, null);
            if (b11 != null) {
                fragment.startActivityForResult(b11, 1000);
            }
        }
    }

    public static final void l(final Fragment fragment, final PostAdViewModel postAdViewModel) {
        o.i(fragment, "<this>");
        o.i(postAdViewModel, "postAdViewModel");
        AlertBottomSheet.a aVar = AlertBottomSheet.D;
        AlertModel alertModel = new AlertModel(true, PostAdDialogs.UploadMediaFailed, new ImageModel(q0.O, null, 2, null), new TextModel(new TextHolder(Integer.valueOf(y0.Fe), null, null, 6, null), null, 0, 6, null), new TextModel(new TextHolder(Integer.valueOf(y0.Ee), null, null, 6, null), null, 6, 2, null), null, new ActionModel(new TextHolder(Integer.valueOf(y0.Ce), null, null, 6, null), null, 2, null), new ActionModel(new TextHolder(Integer.valueOf(y0.Ge), null, null, 6, null), null, 2, null), 32, null);
        g00.a<p> aVar2 = new g00.a<p>() { // from class: com.forsale.app.features.postad.addons.PostAdDialoguesUtilsKt$showAlertMediaError$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // g00.a
            public /* bridge */ /* synthetic */ p invoke() {
                invoke2();
                return p.f75480a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                PostAdDialoguesUtilsKt.g(Fragment.this, postAdViewModel);
            }
        };
        g00.a<p> aVar3 = new g00.a<p>() { // from class: com.forsale.app.features.postad.addons.PostAdDialoguesUtilsKt$showAlertMediaError$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // g00.a
            public /* bridge */ /* synthetic */ p invoke() {
                invoke2();
                return p.f75480a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                PostAdDialoguesUtilsKt.e(PostAdViewModel.this);
            }
        };
        FragmentManager childFragmentManager = fragment.getChildFragmentManager();
        o.h(childFragmentManager, "getChildFragmentManager(...)");
        AlertBottomSheet.a.c(aVar, alertModel, aVar2, aVar3, null, childFragmentManager, 8, null);
    }

    public static final void m(Fragment fragment, final PostAdViewModel postAdViewModel, final g00.a<p> onBuyMoreTokenClicked, final g00.a<p> onDismiss) {
        o.i(fragment, "<this>");
        o.i(postAdViewModel, "postAdViewModel");
        o.i(onBuyMoreTokenClicked, "onBuyMoreTokenClicked");
        o.i(onDismiss, "onDismiss");
        AlertBottomSheet.a aVar = AlertBottomSheet.D;
        AlertModel alertModel = new AlertModel(true, PostAdDialogs.NotEnoughCreditNew, new ImageModel(q0.P, null, 2, null), new TextModel(new TextHolder(Integer.valueOf(y0.Oe), null, null, 6, null), null, 0, 6, null), new TextModel(new TextHolder(Integer.valueOf(y0.Ne), null, null, 6, null), null, 7, 2, null), null, new ActionModel(new TextHolder(Integer.valueOf(y0.Me), null, null, 6, null), null, 2, null), new ActionModel(new TextHolder(Integer.valueOf(y0.Pe), null, null, 6, null), null, 2, null), 32, null);
        g00.a<p> aVar2 = new g00.a<p>() { // from class: com.forsale.app.features.postad.addons.PostAdDialoguesUtilsKt$showAlertNotEnoughCreditError$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // g00.a
            public /* bridge */ /* synthetic */ p invoke() {
                invoke2();
                return p.f75480a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                PostAdDialoguesUtilsKt.d(PostAdViewModel.this, onBuyMoreTokenClicked);
            }
        };
        g00.a<p> aVar3 = new g00.a<p>() { // from class: com.forsale.app.features.postad.addons.PostAdDialoguesUtilsKt$showAlertNotEnoughCreditError$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // g00.a
            public /* bridge */ /* synthetic */ p invoke() {
                invoke2();
                return p.f75480a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                PostAdDialoguesUtilsKt.f(PostAdViewModel.this);
            }
        };
        g00.a<p> aVar4 = new g00.a<p>() { // from class: com.forsale.app.features.postad.addons.PostAdDialoguesUtilsKt$showAlertNotEnoughCreditError$3
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // g00.a
            public /* bridge */ /* synthetic */ p invoke() {
                invoke2();
                return p.f75480a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                onDismiss.invoke();
            }
        };
        FragmentManager childFragmentManager = fragment.getChildFragmentManager();
        o.h(childFragmentManager, "getChildFragmentManager(...)");
        aVar.b(alertModel, aVar2, aVar3, aVar4, childFragmentManager);
    }

    public static final void n(final Fragment fragment) {
        o.i(fragment, "<this>");
        AlertBottomSheet.a aVar = AlertBottomSheet.D;
        AlertModel alertModel = new AlertModel(false, PostAdDialogs.UploadSuccess, new ImageModel(q0.f69756h2, null, 2, null), new TextModel(new TextHolder(Integer.valueOf(y0.J4), null, null, 6, null), null, 0, 6, null), new TextModel(new TextHolder(Integer.valueOf(y0.f70609oc), null, null, 6, null), null, 6, 2, null), null, new ActionModel(new TextHolder(Integer.valueOf(y0.f70660rc), null, null, 6, null), null, 2, null), new ActionModel(new TextHolder(Integer.valueOf(y0.f70592nc), null, null, 6, null), null, 2, null), 32, null);
        g00.a<p> aVar2 = new g00.a<p>() { // from class: com.forsale.app.features.postad.addons.PostAdDialoguesUtilsKt$showAlertPostAdSuccess$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // g00.a
            public /* bridge */ /* synthetic */ p invoke() {
                invoke2();
                return p.f75480a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                PostAdDialoguesUtilsKt.h(Fragment.this, PLFSource.UPLOAD_LISTING_SUCCESS_ALERT);
            }
        };
        g00.a<p> aVar3 = new g00.a<p>() { // from class: com.forsale.app.features.postad.addons.PostAdDialoguesUtilsKt$showAlertPostAdSuccess$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // g00.a
            public /* bridge */ /* synthetic */ p invoke() {
                invoke2();
                return p.f75480a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                PostAdUtilsKt.a(Fragment.this);
            }
        };
        FragmentManager childFragmentManager = fragment.getChildFragmentManager();
        o.h(childFragmentManager, "getChildFragmentManager(...)");
        AlertBottomSheet.a.c(aVar, alertModel, aVar2, aVar3, null, childFragmentManager, 8, null);
    }

    public static final void o(final Fragment fragment, boolean z11, boolean z12, final int i11, List<Addon> list, PostAdDialogs dialogType, final PostAdViewModel postAdViewModel) {
        AlertModel a11;
        o.i(fragment, "<this>");
        o.i(dialogType, "dialogType");
        o.i(postAdViewModel, "postAdViewModel");
        Context context = fragment.getContext();
        if (context != null && (a11 = c.a(context, postAdViewModel.h2(z11, z12, list), postAdViewModel.q3(), false, z11, true, dialogType)) != null) {
            AlertBottomSheet.a aVar = AlertBottomSheet.D;
            g00.a<p> aVar2 = new g00.a<p>() { // from class: com.forsale.app.features.postad.addons.PostAdDialoguesUtilsKt$showAlertUploadErrors$1$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // g00.a
                public /* bridge */ /* synthetic */ p invoke() {
                    invoke2();
                    return p.f75480a;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    PostAdDialoguesUtilsKt.i(Fragment.this, i11, AnalyticsDetailsSource.ADD_LISTING_UPLOADED_WITH_CONDITIONS, postAdViewModel, false);
                }
            };
            FragmentManager childFragmentManager = fragment.getChildFragmentManager();
            o.h(childFragmentManager, "getChildFragmentManager(...)");
            AlertBottomSheet.a.c(aVar, a11, aVar2, null, null, childFragmentManager, 12, null);
        }
    }

    public static final void p(Fragment fragment, PostAdDialogs dialogType, final g00.a<p> onButtonClicked) {
        AlertModel b11;
        o.i(fragment, "<this>");
        o.i(dialogType, "dialogType");
        o.i(onButtonClicked, "onButtonClicked");
        Context context = fragment.getContext();
        if (context != null && (b11 = c.b(context, false, dialogType)) != null) {
            AlertBottomSheet.a aVar = AlertBottomSheet.D;
            g00.a<p> aVar2 = new g00.a<p>() { // from class: com.forsale.app.features.postad.addons.PostAdDialoguesUtilsKt$showAlertUploadGeneralError$1$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // g00.a
                public /* bridge */ /* synthetic */ p invoke() {
                    invoke2();
                    return p.f75480a;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    onButtonClicked.invoke();
                }
            };
            FragmentManager childFragmentManager = fragment.getChildFragmentManager();
            o.h(childFragmentManager, "getChildFragmentManager(...)");
            AlertBottomSheet.a.c(aVar, b11, aVar2, null, null, childFragmentManager, 12, null);
        }
    }

    public static final void q(final Fragment fragment, PostAdViewModel postAdViewModel) {
        final boolean z11;
        o.i(fragment, "<this>");
        o.i(postAdViewModel, "postAdViewModel");
        Context context = fragment.getContext();
        if (context != null) {
            z11 = ContextExtensionsKt.b(context, null, 1, null);
        } else {
            z11 = false;
        }
        AlertBottomSheet.a aVar = AlertBottomSheet.D;
        AlertModel T1 = postAdViewModel.T1(false, z11);
        g00.a<p> aVar2 = new g00.a<p>() { // from class: com.forsale.app.features.postad.addons.PostAdDialoguesUtilsKt$showAlertWaitingApproval$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // g00.a
            public /* bridge */ /* synthetic */ p invoke() {
                invoke2();
                return p.f75480a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                if (z11) {
                    PostAdUtilsKt.a(fragment);
                } else {
                    PostAdDialoguesUtilsKt.j(fragment);
                }
            }
        };
        g00.a<p> aVar3 = new g00.a<p>() { // from class: com.forsale.app.features.postad.addons.PostAdDialoguesUtilsKt$showAlertWaitingApproval$2
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // g00.a
            public /* bridge */ /* synthetic */ p invoke() {
                invoke2();
                return p.f75480a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                if (z11) {
                    return;
                }
                PostAdUtilsKt.a(fragment);
            }
        };
        FragmentManager childFragmentManager = fragment.getChildFragmentManager();
        o.h(childFragmentManager, "getChildFragmentManager(...)");
        AlertBottomSheet.a.c(aVar, T1, aVar2, aVar3, null, childFragmentManager, 8, null);
    }
}
