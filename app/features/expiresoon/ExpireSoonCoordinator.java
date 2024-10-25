package com.forsale.app.features.expiresoon;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.forsale.app.datalayer.network.responses.AboutToExpireListing;
import com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.SellerActionType;
import com.forsale.app.ui.bottomsheets.listingdetailsdeleteaction.sold.DeleteListingSoldBottomSheet;
import com.forsale.app.ui.bottomsheets.listingdetailsselleraction.SellerActionResultBottomSheet;
import com.google.android.material.bottomsheet.d;
import g00.l;
import java.util.List;
import kotlin.collections.r;
import kotlin.jvm.internal.o;
import wz.p;
/* compiled from: ExpireSoonCoordinator.kt */
/* loaded from: classes2.dex */
public final class ExpireSoonCoordinator {

    /* renamed from: a  reason: collision with root package name */
    private final FragmentManager f31228a;

    public ExpireSoonCoordinator(FragmentManager fm2) {
        o.i(fm2, "fm");
        this.f31228a = fm2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b() {
        List<String> q11;
        d dVar;
        q11 = r.q("ExpireSoonBottomSheet", "ExpireSoonOptionsBottomSheet", "DeleteListingSoldBottomSheet", "SellerActionBottomSheet");
        for (String str : q11) {
            Fragment l02 = this.f31228a.l0(str);
            if (l02 != null) {
                if (l02 instanceof d) {
                    dVar = (d) l02;
                } else {
                    dVar = null;
                }
                if (dVar != null) {
                    dVar.dismiss();
                }
            }
        }
    }

    public static /* synthetic */ void g(ExpireSoonCoordinator expireSoonCoordinator, SellerActionType sellerActionType, boolean z11, boolean z12, String str, boolean z13, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            str = null;
        }
        String str2 = str;
        if ((i11 & 16) != 0) {
            z13 = false;
        }
        expireSoonCoordinator.f(sellerActionType, z11, z12, str2, z13);
    }

    public final void c(int i11) {
        DeleteListingSoldBottomSheet.a.b(DeleteListingSoldBottomSheet.F, this.f31228a, i11, null, true, this, new l<Boolean, p>() { // from class: com.forsale.app.features.expiresoon.ExpireSoonCoordinator$startDeleteListingSoldFragment$1
            public final void invoke(boolean z11) {
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ p invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return p.f75480a;
            }
        }, 4, null);
    }

    public final void d(AboutToExpireListing item, g00.a<p> onDismiss) {
        o.i(item, "item");
        o.i(onDismiss, "onDismiss");
        ExpireSoonBottomSheet.D.a(item, this.f31228a, this, onDismiss);
    }

    public final void e(g00.a<p> onDismiss) {
        o.i(onDismiss, "onDismiss");
        ExpireSoonOptionsBottomSheet.C.a(this.f31228a, onDismiss);
    }

    public final void f(SellerActionType sellerActionType, boolean z11, boolean z12, String str, boolean z13) {
        o.i(sellerActionType, "sellerActionType");
        SellerActionResultBottomSheet.G.a(sellerActionType, z11, z12, str, this.f31228a, z13, new l<Boolean, p>() { // from class: com.forsale.app.features.expiresoon.ExpireSoonCoordinator$startSellerActionsResultFragment$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ p invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return p.f75480a;
            }

            public final void invoke(boolean z14) {
                ExpireSoonCoordinator.this.b();
            }
        });
    }
}
