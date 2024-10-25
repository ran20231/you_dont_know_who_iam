package com.forsale.app.ui.bottomsheets.listingdetailsdeleteaction;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.SellerActionType;
import com.forsale.app.features.expiresoon.ExpireSoonCoordinator;
import com.forsale.app.ui.bottomsheets.listingdetailsselleraction.SellerActionResultBottomSheet;
import g00.l;
import kotlin.jvm.internal.o;
import wz.p;
/* compiled from: DeleteUtils.kt */
/* loaded from: classes3.dex */
public final class DeleteUtils {

    /* renamed from: a  reason: collision with root package name */
    public static final DeleteUtils f38176a = new DeleteUtils();

    private DeleteUtils() {
    }

    public static final void a(final Fragment fragment, final boolean z11, boolean z12, boolean z13, ExpireSoonCoordinator expireSoonCoordinator, final l<? super Boolean, p> onActionDone) {
        SellerActionType sellerActionType;
        p pVar;
        o.i(fragment, "fragment");
        o.i(onActionDone, "onActionDone");
        if (z13) {
            sellerActionType = SellerActionType.EXPIRE_SOON_DELETE;
        } else {
            sellerActionType = SellerActionType.DELETE;
        }
        if (expireSoonCoordinator != null) {
            ExpireSoonCoordinator.g(expireSoonCoordinator, sellerActionType, true, z11, null, z12, 8, null);
            pVar = p.f75480a;
        } else {
            pVar = null;
        }
        if (pVar == null) {
            SellerActionResultBottomSheet.a aVar = SellerActionResultBottomSheet.G;
            FragmentManager childFragmentManager = fragment.getChildFragmentManager();
            o.h(childFragmentManager, "getChildFragmentManager(...)");
            SellerActionResultBottomSheet.a.b(aVar, sellerActionType, true, z11, null, childFragmentManager, z12, new l<Boolean, p>() { // from class: com.forsale.app.ui.bottomsheets.listingdetailsdeleteaction.DeleteUtils$showDeleteResult$1$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // g00.l
                public /* bridge */ /* synthetic */ p invoke(Boolean bool) {
                    invoke(bool.booleanValue());
                    return p.f75480a;
                }

                public final void invoke(boolean z14) {
                    androidx.fragment.app.p activity;
                    if (!z14 || (activity = Fragment.this.getActivity()) == null) {
                        return;
                    }
                    onActionDone.invoke(Boolean.valueOf(z11));
                    activity.setResult(-1);
                    activity.finish();
                }
            }, 8, null);
        }
    }

    public static /* synthetic */ void b(Fragment fragment, boolean z11, boolean z12, boolean z13, ExpireSoonCoordinator expireSoonCoordinator, l lVar, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            z13 = false;
        }
        boolean z14 = z13;
        if ((i11 & 16) != 0) {
            expireSoonCoordinator = null;
        }
        a(fragment, z11, z12, z14, expireSoonCoordinator, lVar);
    }
}
