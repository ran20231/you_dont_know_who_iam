package com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.buyerlistingchat;

import aa.cn;
import android.view.View;
import androidx.lifecycle.s;
import androidx.lifecycle.t;
import com.forsale.app.features.categories.listingdetails.buyerctas.BuyerActionCTAsKt;
import com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsViewModel;
import com.forsale.designSystem.theme.ThemeKt;
import g00.p;
import java.util.List;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kr.b;
import t9.r0;
import t9.t0;
/* compiled from: UserActionsItem.kt */
/* loaded from: classes2.dex */
public final class UserActionsItem extends pr.a<UserActionsViewHolder> {

    /* renamed from: f  reason: collision with root package name */
    private final NewListingDetailsViewModel f27372f;

    /* renamed from: g  reason: collision with root package name */
    private final s f27373g;

    /* compiled from: UserActionsItem.kt */
    /* loaded from: classes2.dex */
    public static final class UserActionsViewHolder extends b.c<UserActionsItem> {

        /* renamed from: a  reason: collision with root package name */
        private final cn f27374a;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public UserActionsViewHolder(aa.cn r3) {
            /*
                r2 = this;
                java.lang.String r0 = "binding"
                kotlin.jvm.internal.o.i(r3, r0)
                android.view.View r0 = r3.getRoot()
                java.lang.String r1 = "getRoot(...)"
                kotlin.jvm.internal.o.h(r0, r1)
                r2.<init>(r0)
                r2.f27374a = r3
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.buyerlistingchat.UserActionsItem.UserActionsViewHolder.<init>(aa.cn):void");
        }

        @Override // kr.b.c
        /* renamed from: f */
        public void b(final UserActionsItem item, List<? extends Object> payloads) {
            o.i(item, "item");
            o.i(payloads, "payloads");
            this.f27374a.h0(item.f27372f);
            this.f27374a.O.setContent(r0.b.c(1033805403, true, new p<androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.buyerlistingchat.UserActionsItem$UserActionsViewHolder$bindView$1
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar, int i11) {
                    if ((i11 & 11) == 2 && aVar.i()) {
                        aVar.L();
                        return;
                    }
                    if (androidx.compose.runtime.c.I()) {
                        androidx.compose.runtime.c.U(1033805403, i11, -1, "com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.buyerlistingchat.UserActionsItem.UserActionsViewHolder.bindView.<anonymous> (UserActionsItem.kt:29)");
                    }
                    final UserActionsItem userActionsItem = UserActionsItem.this;
                    ThemeKt.a(null, null, r0.b.b(aVar, -666570140, true, new p<androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.buyerlistingchat.UserActionsItem$UserActionsViewHolder$bindView$1.1
                        {
                            super(2);
                        }

                        public final void b(androidx.compose.runtime.a aVar2, int i12) {
                            if ((i12 & 11) == 2 && aVar2.i()) {
                                aVar2.L();
                                return;
                            }
                            if (androidx.compose.runtime.c.I()) {
                                androidx.compose.runtime.c.U(-666570140, i12, -1, "com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.buyerlistingchat.UserActionsItem.UserActionsViewHolder.bindView.<anonymous>.<anonymous> (UserActionsItem.kt:30)");
                            }
                            BuyerActionCTAsKt.a(UserActionsItem.this.f27372f, aVar2, 8);
                            if (androidx.compose.runtime.c.I()) {
                                androidx.compose.runtime.c.T();
                            }
                        }

                        @Override // g00.p
                        public /* bridge */ /* synthetic */ wz.p invoke(androidx.compose.runtime.a aVar2, Integer num) {
                            b(aVar2, num.intValue());
                            return wz.p.f75480a;
                        }
                    }), aVar, 384, 3);
                    if (androidx.compose.runtime.c.I()) {
                        androidx.compose.runtime.c.T();
                    }
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ wz.p invoke(androidx.compose.runtime.a aVar, Integer num) {
                    b(aVar, num.intValue());
                    return wz.p.f75480a;
                }
            }));
            BuildersKt__Builders_commonKt.launch$default(t.a(item.f27373g), null, null, new UserActionsItem$UserActionsViewHolder$bindView$2(item, null), 3, null);
        }

        @Override // kr.b.c
        /* renamed from: g */
        public void e(UserActionsItem item) {
            o.i(item, "item");
            item.f27372f.a2().j();
        }
    }

    public UserActionsItem(NewListingDetailsViewModel listingDetailsViewModel, s lifeCycle) {
        o.i(listingDetailsViewModel, "listingDetailsViewModel");
        o.i(lifeCycle, "lifeCycle");
        this.f27372f = listingDetailsViewModel;
        this.f27373g = lifeCycle;
    }

    @Override // kr.m
    public int getType() {
        return r0.U7;
    }

    @Override // pr.a
    public int t() {
        return t0.f70349z5;
    }

    @Override // pr.a
    /* renamed from: x */
    public UserActionsViewHolder u(View v11) {
        o.i(v11, "v");
        cn f02 = cn.f0(v11);
        f02.U(this.f27373g);
        o.h(f02, "apply(...)");
        return new UserActionsViewHolder(f02);
    }
}
