import { FooterContainer, IconContainer, Icon, Copy } from './style'
import { TiSocialFacebookCircular } from 'react-icons/ti';
import { IoLogoInstagram, IoLogoTwitter } from 'react-icons/io';
import { BiCopyright } from 'react-icons/bi';

export function Footer() {
    return (
        <FooterContainer>
            <Copy><BiCopyright />Trabalho-PRJ</Copy>
        </FooterContainer>
    )
}