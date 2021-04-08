package net.sharksystem.hoc;

import net.sharksystem.SharkException;
import net.sharksystem.SharkUnknownBehaviourException;
import net.sharksystem.asap.ASAPException;
import net.sharksystem.asap.ASAPPeer;

import java.io.IOException;

public class SharkHocImpl implements SharkHoc {
    @Override
    public void onStart(ASAPPeer asapPeer) throws SharkException {
        // TODO
    }

    @Override
    public void setBehaviour(String s, boolean b) throws SharkUnknownBehaviourException, ASAPException, IOException {
        // we have non yet.
        return;
    }
}
