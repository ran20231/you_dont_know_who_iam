package com.forsale.app.ui.bottomsheets.listingdetailsmoreactions;

import aa.qo;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.s;
import com.forsale.app.datalayer.network.responses.ListingItemBrief;
import com.forsale.app.datalayer.network.responses.ListingItemDetails;
import com.forsale.app.datalayer.repositories.TranslationRepository;
import com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.userinfoitem.UserInfoViewModel;
import com.forsale.app.utils.ContextExtensionsKt;
import java.util.List;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.flow.FlowCollector;
import kr.b;
import t9.r0;
import t9.t0;
import tg.c;
import wz.p;
/* compiled from: WhatsAppUserItem.kt */
/* loaded from: classes3.dex */
public final class WhatsAppUserItem extends pr.a<SMSViewHolder> {

    /* renamed from: f  reason: collision with root package name */
    private final ActionUserItemViewModel f38446f;

    /* renamed from: g  reason: collision with root package name */
    private final s f38447g;

    /* renamed from: h  reason: collision with root package name */
    private final FragmentManager f38448h;

    /* renamed from: i  reason: collision with root package name */
    private final UserInfoViewModel f38449i;

    /* renamed from: j  reason: collision with root package name */
    private final int f38450j;

    /* renamed from: k  reason: collision with root package name */
    private final int f38451k;

    /* compiled from: WhatsAppUserItem.kt */
    /* loaded from: classes3.dex */
    public static final class SMSViewHolder extends b.c<WhatsAppUserItem> {

        /* renamed from: a  reason: collision with root package name */
        private final qo f38452a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: WhatsAppUserItem.kt */
        /* loaded from: classes3.dex */
        public static final class a implements FlowCollector<p> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ WhatsAppUserItem f38453a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ SMSViewHolder f38454b;

            a(WhatsAppUserItem whatsAppUserItem, SMSViewHolder sMSViewHolder) {
                this.f38453a = whatsAppUserItem;
                this.f38454b = sMSViewHolder;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a */
            public final Object emit(p pVar, zz.a<? super p> aVar) {
                if (this.f38453a.x() != null) {
                    WhatsAppUserItem whatsAppUserItem = this.f38453a;
                    SMSViewHolder sMSViewHolder = this.f38454b;
                    if (whatsAppUserItem.z().n() != null) {
                        c h11 = sMSViewHolder.h(UserContactMode.WHATSAPP_ONLY, whatsAppUserItem);
                        MoreActionsBottomSheet moreActionsBottomSheet = new MoreActionsBottomSheet();
                        moreActionsBottomSheet.p0(h11);
                        moreActionsBottomSheet.show(whatsAppUserItem.v(), "MoreActionsBottomSheet");
                    }
                }
                return p.f75480a;
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public SMSViewHolder(aa.qo r3) {
            /*
                r2 = this;
                java.lang.String r0 = "binding"
                kotlin.jvm.internal.o.i(r3, r0)
                android.view.View r0 = r3.getRoot()
                java.lang.String r1 = "getRoot(...)"
                kotlin.jvm.internal.o.h(r0, r1)
                r2.<init>(r0)
                r2.f38452a = r3
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.ui.bottomsheets.listingdetailsmoreactions.WhatsAppUserItem.SMSViewHolder.<init>(aa.qo):void");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final c h(UserContactMode userContactMode, WhatsAppUserItem whatsAppUserItem) {
            String str;
            String str2;
            ListingItemDetails n11 = whatsAppUserItem.z().n();
            if (n11 == null || (str = Integer.valueOf(n11.getId()).toString()) == null) {
                ListingItemBrief l11 = whatsAppUserItem.z().l();
                if (l11 != null) {
                    str = Integer.valueOf(l11.getId()).toString();
                } else {
                    str = "";
                }
            }
            String str3 = str;
            ListingItemDetails n12 = whatsAppUserItem.z().n();
            if (n12 != null) {
                str2 = n12.getContacts();
            } else {
                str2 = null;
            }
            String str4 = str2;
            o.f(str4);
            int isPm = whatsAppUserItem.z().n().isPm();
            int isHideMyNumber = whatsAppUserItem.z().n().isHideMyNumber();
            ListingItemDetails n13 = whatsAppUserItem.z().n();
            ListingItemBrief l12 = whatsAppUserItem.z().l();
            TranslationRepository.Translation A = whatsAppUserItem.z().A();
            boolean H = whatsAppUserItem.z().H();
            boolean F = whatsAppUserItem.z().F();
            UserInfoViewModel x11 = whatsAppUserItem.x();
            o.f(x11);
            return new c(str3, str4, isPm, isHideMyNumber, userContactMode, n13, l12, null, A, H, F, x11, null, null, null, 28672, null);
        }

        @Override // kr.b.c
        /* renamed from: g */
        public void b(WhatsAppUserItem item, List<? extends Object> payloads) {
            o.i(item, "item");
            o.i(payloads, "payloads");
            final qo qoVar = this.f38452a;
            qoVar.U(item.w());
            qoVar.h0(item.z());
            item.z().w().h(item.w(), new FlowCollector<String>() { // from class: com.forsale.app.ui.bottomsheets.listingdetailsmoreactions.WhatsAppUserItem$SMSViewHolder$bindView$1$1
                @Override // kotlinx.coroutines.flow.FlowCollector
                /* renamed from: a */
                public final Object emit(String str, zz.a<? super p> aVar) {
                    if (str != null) {
                        Context context = qo.this.getRoot().getContext();
                        o.h(context, "getContext(...)");
                        ContextExtensionsKt.M(context, str, null, WhatsAppUserItem$SMSViewHolder$bindView$1$1$emit$2$1.f38456a, 2, null);
                    }
                    return p.f75480a;
                }
            });
            item.z().t().h(item.w(), new a(item, this));
        }

        @Override // kr.b.c
        /* renamed from: i */
        public void e(WhatsAppUserItem item) {
            o.i(item, "item");
        }
    }

    public WhatsAppUserItem(ActionUserItemViewModel viewModel, s lifeCycle, FragmentManager fragmentManager, UserInfoViewModel userInfoViewModel) {
        o.i(viewModel, "viewModel");
        o.i(lifeCycle, "lifeCycle");
        o.i(fragmentManager, "fragmentManager");
        this.f38446f = viewModel;
        this.f38447g = lifeCycle;
        this.f38448h = fragmentManager;
        this.f38449i = userInfoViewModel;
        this.f38450j = t0.V5;
        this.f38451k = r0.Db;
    }

    @Override // kr.m
    public int getType() {
        return this.f38451k;
    }

    @Override // pr.a
    public int t() {
        return this.f38450j;
    }

    public final FragmentManager v() {
        return this.f38448h;
    }

    public final s w() {
        return this.f38447g;
    }

    public final UserInfoViewModel x() {
        return this.f38449i;
    }

    @Override // pr.a
    /* renamed from: y */
    public SMSViewHolder u(View v11) {
        o.i(v11, "v");
        qo f02 = qo.f0(v11);
        o.h(f02, "bind(...)");
        return new SMSViewHolder(f02);
    }

    public final ActionUserItemViewModel z() {
        return this.f38446f;
    }
}
